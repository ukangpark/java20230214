package ch18.lecture.p03inputstream;

import java.io.*;

public class C05InputStream {
	public static void main(String[] args) {
		//인풋 아웃풋 같이 써서 그림파일을 복사해보자
		//그림파일을 가져와 - InputStream 사용
		//가지고 온걸 새로운 파일로 만들어서 출력해 - OutputStream 사용
		String src = "output/강아지1.jpg";//원래있는 파일을 가지고 와서 src변수에 담았다.
		String des = "output/강아지1_copy.jpg";//새로운 파일을 만들어서 des변수에 담았다.
		
		try (
			var is = new FileInputStream(src);
				var os = new FileOutputStream(des);) {
			
//			int data = 0;
//			
//			while ((data = is.read())!= -1) {//read로 파일을 읽어와서!! data에 할당하고
//				os.write(data);//data를 write해서 새로운 파일로 출력해!!!
//			}
			
			int data = is.read();
			os.write(data);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}

}

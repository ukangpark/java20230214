package ch18.lecture.p03inputstream;

import java.io.*;

public class C06InputStream {
	public static void main(String[] args) {
		String src = "output/강아지1.jpg";
		String des = "output/강아지1_copy2.jpg";
		
		try (var is = new FileInputStream(src);
				var os = new FileOutputStream(des);) {
			
			byte[] data = new byte[1024];
			
			//복사본은 같은 크기를 가져야하기 때문에 길이를 같게 해 줘야함
			int len = 0;
			while ((len = is.read(data)) != -1) {
				os.write(data, 0, len);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("복사완료");
	}

}

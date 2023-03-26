package ch18.lecture.p03inputstream;

import java.io.*;

public class C02InputStream {
	public static void main(String[] args) {
		try (var is = new FileInputStream("output/test3.db")) {
			//반복해서 읽으니까 보통 반복문을 사용
			//read는 바이트를 읽는데 리턴은 int로 함
			
			int data = 0;
			while((data = is.read()) != -1) {
				System.out.println(data);//3번실행이 되겠죠?
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

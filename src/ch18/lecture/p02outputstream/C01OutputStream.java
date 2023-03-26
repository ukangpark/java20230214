package ch18.lecture.p02outputstream;

import java.io.*;

public class C01OutputStream {
	public static void main(String[] args) {
		//OutputStream
		//바이트 단위 출력 스트림
		
		try {
		String des = "output/output1.txt";
		OutputStream os = new FileOutputStream(des);
		//outputsream은 출력 스트림이니까 주요 가지고 있는 메소드는 write메소드
		
		os.write(250);
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}

}

package ch18.lecture.p03inputstream;

import java.io.*;

public class C01InputStream {
	public static void main(String[] args) {
		//InputStream
		//byte 단위 입력 스트림
		//주요 메소드 : read
		
		String name = "output/test3.db"; //3바이트 크기 파일
		try (InputStream is = new FileInputStream(name)) {
			//read : 한바이트 읽기
//			is.read();
//			is.read();
//			is.read();// 왜 3번 작성? => test3.db는 3바이트니까
//			is.read();//4번째는 어떤일이 일어날까? API : 끝에 도달하면 -1을 리턴함
			
			System.out.println(is.read());//20
			System.out.println(is.read());//30
			System.out.println(is.read());//40
			System.out.println(is.read());//-1
			System.out.println(is.read());//-1
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램종료");
	}

}

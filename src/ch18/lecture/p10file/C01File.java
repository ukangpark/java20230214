package ch18.lecture.p10file;

import java.io.*;

public class C01File {
	public static void main(String[] args) {
		//File : (file 또는 directory)에 관한 객체
		File file = new File("src/ch18/lecture/p10file/C01File.java");
		
		//파일의 크기 파일의 명 읽을수있는지 쓸수있는지 등등의 메소드들이 존재함
		
		System.out.println(file.getName());//파일명
		System.out.println(file.length());//크기는
		System.out.println(file.exists());//존재하는가
		System.out.println(file.isFile());//파일인가
		System.out.println(file.isDirectory());//디렉토리인가
		
	}

}

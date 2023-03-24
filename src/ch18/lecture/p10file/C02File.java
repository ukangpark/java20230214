package ch18.lecture.p10file;

import java.io.*;

public class C02File {
	public static void main(String[] args) {
		//디렉토리(폴더)정보 얻기
		File file = new File("output");//내가만든 디렉토리
		
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		System.out.println("디렉토리내의 파일 목록");
		//디렉토리 안에 있는 파일 목록 보기
		File[] files = file.listFiles();
		for(File f : files) {
			System.out.println(f.getName());
		}
	}

}

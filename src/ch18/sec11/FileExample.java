package ch18.sec11;

import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;

public class FileExample {
	public static void main(String[] args) throws Exception {
		//File 객체 생성
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		//존재하지 않으면 디렉토리 또는 파일 생성
		if(dir.exists() == false) {dir.mkdirs();}//mkdirs는 상위폴더까지 다만든다. ex)Temp, images까지 다 만듬
		if(file1.exists() == false) {file1.createNewFile();}
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		//Temp 폴더의 내용 출력
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd a HH:mm");
		for (File f : contents) {
			System.out.printf("%-25s", sdf.format(new Date(f.lastModified())) );
			if(f.isDirectory()) {
				
			System.out.printf("%-10s%-20s", "<DIR>", f.getName());
		}else {
			System.out.printf("%-10s%-20s", f.length(), f.getName());
		}
			System.out.println();
		}
	}

}

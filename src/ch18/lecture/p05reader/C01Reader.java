package ch18.lecture.p05reader;

import java.io.*;

import javax.annotation.processing.*;
import javax.lang.model.element.*;
import javax.tools.*;
import javax.tools.JavaFileManager.*;

public class C01Reader {
	public static void main(String[] args) {
		//Reader : 문자단위 입력스트림
		//주요메소드 : read
		
		String name = "output/writer2.txt";
		
		try (Reader rd = new FileReader(name)) {
			
			int c1 = rd.read();//'가'를 읽을텐데 int를 리턴하니까 '가'의 유니코드가 리턴됨
			System.out.println(c1);//가의 유니코드 출력
			System.out.println((char)c1);//'가'가 출력됨
			
			int data = 0;
			while ((data = rd.read()) != -1) {
				System.out.println(data + ":" + (char)data);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

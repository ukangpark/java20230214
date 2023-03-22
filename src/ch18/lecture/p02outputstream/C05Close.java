package ch18.lecture.p02outputstream;

import java.io.*;

public class C05Close {
	public static void main(String[] args) {
		//var(지역변수 선언 간단히)
		String s = "java";
		var s2 = "java";
		
		// try_with_resources에 var 사용가능
		//try(OutputStream os = new FileOutputStream("")){}catch(){}
		try(var os = new FileOutputStream("")) {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

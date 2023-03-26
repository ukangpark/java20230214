package ch18.lecture.p09filter;

import java.io.*;

public class C01Filter {
	public static void main(String[] args) {
		//stream 연결 가능
		//같은 흐름끼리로 연결 가능
		
		String fileName = "output/byte1.txt";
		
		try(
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis);//위의 코드를 문자도 읽고싶다.
		BufferedReader bis = new BufferedReader(isr);) {//위의 코드를 효율적으로 읽고싶다.
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

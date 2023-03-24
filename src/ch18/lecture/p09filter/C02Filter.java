package ch18.lecture.p09filter;

import java.io.*;

public class C02Filter {
	public static void main(String[] args) {
		String fileName = "output/byte1.txt";
		
		try(
		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(fis);//위의 코드를 효율적으로 읽고싶다.
		InputStreamReader isw = new InputStreamReader(bis);) {//위의 코드를 문자도 읽고 싶다.
		
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

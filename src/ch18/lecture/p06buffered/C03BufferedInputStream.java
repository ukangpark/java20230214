package ch18.lecture.p06buffered;

import java.io.*;

public class C03BufferedInputStream {
	public static void main(String[] args) {
		
		String name = "output/buffered1.txt";
		
		try (
		InputStream fis = new FileInputStream(name);
		InputStream is = new BufferedInputStream(fis);) {
			
			while (is.read() != -1) {
				
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

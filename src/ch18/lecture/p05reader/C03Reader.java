package ch18.lecture.p05reader;

import java.io.*;

public class C03Reader {
	public static void main(String[] args) {
		String name = "output/writer2.txt";
		
		try(var rd = new FileReader(name)) {
			
			char[] data = new char[5];
			//흔적을 안남기기위해서 len까지만 읽도록 하면 됨
			int len = 0;
			
			while ((len = rd.read(data)) != -1) {
				System.out.println(new String(data,0,len));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

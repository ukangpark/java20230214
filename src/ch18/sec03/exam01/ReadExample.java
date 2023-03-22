package ch18.sec03.exam01;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try (var is = new FileInputStream("output/test1.db")){
			
			while(true) {
				int data = is.read();
				if(data == -1) break;//statement 1개니까 {}생략된것~
					System.out.println(data);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

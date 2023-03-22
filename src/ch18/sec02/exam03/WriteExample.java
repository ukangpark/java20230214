package ch18.sec02.exam03;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try(var os = new FileOutputStream("output/test3.db")) {
			byte[] array = {10,20,30,40,50};
			
			os.write(array,1,3);//3bytes
			
			os.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package ch18.lecture.p03inputstream;

import java.io.*;

public class C03InputStream {
	public static void main(String[] args) {
		String name = "output/output6.txt";//12bytes
		try(var is = new FileInputStream(name)) {
			
			byte[] arr = new byte[5];
			
			int len1 = is.read(arr);////5bytes를 읽음
			int len2 = is.read(arr);////5bytes를 읽음
			int len3 = is.read(arr);////2bytes를 읽음
			int len4 = is.read(arr);////-1을 리턴
			
			System.out.println(len1);//5
			System.out.println(len2);//5
			System.out.println(len3);//2
			System.out.println(len4);//-1
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

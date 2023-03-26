package ch18.sec04.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		
		try {
			Reader rd = null; 
					
			//1문자씩 읽기
			rd = new FileReader("output/test.txt");
			while (true) {
				int data = rd.read();//1문자읽음
				if (data == -1) break;//-1만나면 종료
				System.out.print((char)data);//문자로읽기(케스팅)
			}
			
			System.out.println();
			
			//문자 배열로 읽기			
			rd = new FileReader("output/test.txt");
			char[] data = new char[100];
			while(true) {
				int num = rd.read(data);
				if(num == -1) break;
				for(int i=0; i<num; i++) {
					System.out.print(data[i]);
				}
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();

		}
		
	}

}

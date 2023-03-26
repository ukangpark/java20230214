package ch18.sec03.exam02;

import java.io.*;
import java.util.*;

public class ReadExample {
	public static void main(String[] args) {
		
		try (var is = new FileInputStream("output/test2.db"/*3bytes*/)) {
			
			byte[] data = new byte[100];//바이트 길이가 100인 data
			
			while(true) {
				int num = is.read(data);//3바이트만 채워지고 나머지는 채워지지 않음 => 즉, 3을 리턴
				if(num == -1) break;
				
				for (int i=0; i<num; i++) {
					System.out.println(data[i]);
					System.out.println(Arrays.toString(data));
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package ch18.sec03.exam02;

import java.io.*;
import java.util.*;

public class ReadExample2 {
	public static void main(String[] args) {
		//읽을 파일 크기 : 3bytes
		try (var is = new FileInputStream("output/test2.db")) {
			byte[] data = new byte[5]; //{0,0,0,0,0} 초기화되있는 상태
			
			//Arrays.fill(data, (byte) 1); 배열을 1로 전부 채움{1,1,1,1,1} => is read로 읽으면 뒤의 2개의 배열은 1로 남아있겠죠?
			
			System.out.println(Arrays.toString(data));
			is.read(data); //3개의 바이트를 읽었으니까 앞에 3개만 채워지고 뒤에는 0으로 남아있음
			System.out.println(Arrays.toString(data));
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

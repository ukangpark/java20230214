package ch18.lecture.p03inputstream;

import java.io.*;
import java.util.*;

public class C04InputStream {
	public static void main(String[] args) {
		String name = "output/output6.txt"; //12바이트
		
		try (var is = new FileInputStream(name)) {
			
			byte[] arr = new byte[5];
			
			int len = 0;
			while ((len = is.read(arr))!= -1) {
				System.out.println(Arrays.toString(arr));//12바이트니까 배열이 3개 출력되겠죠?
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

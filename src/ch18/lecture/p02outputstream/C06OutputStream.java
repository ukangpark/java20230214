package ch18.lecture.p02outputstream;

import java.io.*;

public class C06OutputStream {
	public static void main(String[] args) {
		try (var os = new FileOutputStream("output/output6.txt")) {

			// 한 바이트 쓰기
			os.write(298734);// 아무리큰인티저를 써도 1바이트차지
			os.write(987784434);// 아무리큰인티저를 써도 1바이트차지
			
			// 여러 바이트 쓰기
			byte[] data = { 3, 1, 0, 127, 64 };
			os.write(data);// 5바이트
			os.write(data);// 5바이트
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		//output6파일은 총 12바이트를 사용하고 있겠죠?
}

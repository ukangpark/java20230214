package ch18.lecture.p02outputstream;

import java.io.*;

public class C07OutputStream {
	public static void main(String[] args) {
		try (var os = new FileOutputStream("output/output7.txt")) {
			//한바이트 쓰기
			os.write(30);
			os.write(19570);
			
			//여러바이트 쓰기
			byte[] data = {3,3,3,3,3,3,3,3,3};
			os.write(data);
			
			//여러바이트 쓰기 (배열의 일부분)
			os.write(data, 0, 3); //data의 0번인덱스부터 3개를 쓰겠다.=>3바이트
			os.write(data, 4, 5); //data의 4번인덱스부터 5개를 쓰겠다.=>5바이트
			os.write(data, 0, data.length); //9바이트 => os.write(data);와 같음
		}catch(Exception e) {
			e.printStackTrace();
		}
		//output7파일은 총 28바이트를 썼겠죠?
	}

}

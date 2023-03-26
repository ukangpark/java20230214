package ch18.lecture.p04writer;

import java.io.*;

public class C01Writer {
	public static void main(String[] args) {
		//Writer : 문자단위 출력 스트림
		//주요 메소드 : write
		
		//인스턴스만들려면 어떤 생성자가 있는지 API보면 된다.
//		Writer wr = new FileWriter(null);
		
		
		String fileName = "output/writer1.txt";
		try(Writer wr = new FileWriter(fileName);) {
			
			//write (인티저파라미터를 받는)사용해보자
			wr.write('a');
			wr.write('b');
			wr.write('가');
			wr.write('나');
			wr.write(9850);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

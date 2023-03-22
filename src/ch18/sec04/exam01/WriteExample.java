package ch18.sec04.exam01;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try(var wr = new FileWriter("output/test.txt")) {
			
			//1문자씩 출력
			char a = 'A';
			wr.write(a);
			char b = 'B';
			wr.write(b);
			
			//char 배열 출력
			char[] arr = {'C', 'D', 'E'};
			wr.write(arr);
			
			//문자열 출력
			wr.write("FGH");
			
			//버퍼에 잔류하고 있는 문자들을 출력하고, 버퍼를 비움
			wr.flush();
			
			//출력 스트림을 닫고 메모리 해제는 ()에서 했음
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

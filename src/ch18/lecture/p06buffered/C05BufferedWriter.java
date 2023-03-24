package ch18.lecture.p06buffered;

import java.io.*;

public class C05BufferedWriter {
	public static void main(String[] args) {
		String name = "output/buffered5.txt";

		try (
				FileWriter fw = new FileWriter(name);
				BufferedWriter bw = new BufferedWriter(fw);) {
			
			for (int i=0; i<10; i++) {
			//하드디스크까지 가는 횟수가 적음
			bw.write("hello world");
			bw.newLine();//buffered에 있는 메소드
			}
			
			bw.flush();//buffered면 반드시 작성
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

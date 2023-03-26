package ch18.lecture.p04writer;

import java.io.*;

public class C02Writer {
	public static void main(String[] args) {
		
		String name = "output/writer2.txt";
		
		try (var wr = new FileWriter(name)) {
			char[] data = {'가', '나', '다', 'a', 'b'};
			
			wr.write(data);
			
			wr.write("hello world");
			wr.write("""
					<h1>Lorem Ipsum</h1>
					""");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

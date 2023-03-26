package ch18.lecture.p06buffered;

import java.io.*;

public class C02OutputStream {
	public static void main(String[] args) {
		String name = "output/buffered1.txt";
		try (
		OutputStream os = new FileOutputStream(name);
		) {
		long start = System.nanoTime();
		for (int i=0; i<1000_000; i++) {//1000_000바이트 씀
			os.write(1);
		}
		
		os.flush();//의미 없지만 쏴라~
		long end = System.nanoTime();
		
		System.out.println((end - start) + "ns");
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

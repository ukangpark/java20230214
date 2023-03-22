package ch18.lecture.p06buffered;

import java.io.*;

public class C01BufferedOutputStream {
	public static void main(String[] args) {
		
		String name = "output/buffered1.txt";
		try (
		OutputStream fos = new FileOutputStream(name);
		OutputStream os = new BufferedOutputStream(fos);
		) {
		long start = System.nanoTime();
		for (int i=0; i<1000_000; i++) {//1000_000바이트 씀
			os.write(1);
		}
		
		os.flush();//버퍼에 모이면 쏘ㅏ라~
		long end = System.nanoTime();
		
		System.out.println((end - start) + "ns");
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

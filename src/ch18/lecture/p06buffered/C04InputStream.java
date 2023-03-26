package ch18.lecture.p06buffered;

import java.io.*;

public class C04InputStream {
	public static void main(String[] args) {

		String name = "output/buffered1.txt";

		try (InputStream is = new FileInputStream(name);) {

			while (is.read() != -1) {

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

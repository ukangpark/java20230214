package ch11.lecture.p04throw;

import java.io.*;

public class C08Throw {
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void method1() throws FileNotFoundException, ClassNotFoundException {
		
	}
}

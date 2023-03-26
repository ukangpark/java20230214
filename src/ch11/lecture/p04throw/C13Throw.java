package ch11.lecture.p04throw;

import java.io.*;

public class C13Throw {

	public static void main(String[] args) throws Exception {
		method2();
	}
	
	
	public static void method2() throws Exception{
		method1();
	}
	//현실에서는 throws로 던지는 걸 많이 씀
	public static void method1() throws Exception {
		new FileInputStream("");
	}

}

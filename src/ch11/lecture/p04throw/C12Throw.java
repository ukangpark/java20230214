package ch11.lecture.p04throw;

import java.io.*;

public class C12Throw {
	
	public static void main(String[] args) {
//		method1();//exception을 다뤄야함 => trycatch로 exception을 잡거나, throws로 exception을 던지거나
					// 둘중에 하나 아무거나써도 무방하지만, fileNotFoundException을 잡을수없음
	}
	
	public static void method1() throws Exception {
		new FileInputStream("");
	}

}

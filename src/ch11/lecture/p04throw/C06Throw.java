package ch11.lecture.p04throw;

import java.io.*;

public class C06Throw {
	public static void main(String[] args) {
		
	}
	
	//상위타입으로 묶어서 1개로 명시할 수도 있음 (Exception / Throwable
	public static void method2() throws Exception {
		int a = 1;
		
		if(a == 1) {
			throw new ClassNotFoundException();
		}else {
			throw new FileNotFoundException();
		}
	}
	
	//2개의 exception모두 메소드에 명시 해 줘야함 , 로 명시하면됨ㅁ
	public static void method1() throws ClassNotFoundException, FileNotFoundException {
		int a = 1;
		
		if(a == 1) {
			throw new ClassNotFoundException();
		}else {
			throw new FileNotFoundException();
		}
	}

}

package ch11.lecture.p04throw;

import java.io.*;

public class C09Throw {
	public static void main(String[] args) {
//		try {
////		method1(); //catch만들어줬는데 왜 오류? -> Exception을 던진걸 받았기 때문에 하위타입으로 잡을 수 없음
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
	}
	
	
	public static void method1() throws Exception {
		boolean a = true;
		if (a) {
			throw new ClassNotFoundException();
		}else {
			throw new FileNotFoundException();
		}
	}

}

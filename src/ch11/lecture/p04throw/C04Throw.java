package ch11.lecture.p04throw;

import javax.management.*;

public class C04Throw {
	public static void main(String[] args) {
//		method1();//에러는 안나지만 프로그램 종료됨 -> 싫으면? try catch로 감싸서 catch하기
		//메소드를 호출하는 곳에서 해당 메소드를 잡아줘야함
		
		try {
		method1();
		}catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		System.out.println("continue..");
	}

	public static void method1() throws RuntimeException {
		throw new RuntimeException();// runtimeException이니까 명시해도되고 안해도됨
	}
}

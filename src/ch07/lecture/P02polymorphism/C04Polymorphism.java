package ch07.lecture.P02polymorphism;

import java.util.*;

public class C04Polymorphism {
	public static void main(String[] args) {
		String s1 = "java";
		Scanner sc1 = new Scanner("");
		
		method1(s1);//Object에 String은 들어갈수있음
		method1(sc1);//Object에 Scanner이 들어 갈 수있음
	}

	public static void method1(Object o) {
//		o.charAt(0); //object는 String이다 할 수 없음
		
		String s = o.toString();//String이 들어와서 실행가능
		
		System.out.println(s);//Scanner가 들어와서 실행가능
				
	}
}

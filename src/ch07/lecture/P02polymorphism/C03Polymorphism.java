package ch07.lecture.P02polymorphism;

import java.util.*;

public class C03Polymorphism {
	public static void main(String[] args) {
		String s1 = "Hello";
		Object o1 = s1;
		
		Object o2 = "java";
		
		char c1 = s1.charAt(0);
//		char c2 = o1.charAt(0);//안됨 -> Object가 가지고 있는 method중 CharAt메소드는 존재하지 않음
		
		Scanner sc1 = new Scanner("");
		Object o3 = sc1;
		
		Object o4 = new Scanner("");
		
		sc1.nextLine();
//		o3.nextLine();//안됨
		
	}

}

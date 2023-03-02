package ch06.lecture.P10access;

import ch06.lecture.P10access.package1.*;

public class C02AccessModifier {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		
		System.out.println(o1.name);
//		System.out.println(o1.married);//접근불가능 왜? -> 같은 패키지만 접근가능
		o1.method1();
//		o1.method3(); //접근불가능 -> 같은 패키지만 접근가능
		
	}

}

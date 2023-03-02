package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	public C() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;
//		a.field2 = 1; // default (패키지가 다름)
//		a.field3 = 1; // private (클래스가 다름)
		
		//메소드 호출
		a.method1();
//		a.method2(); // default (패키지가 다름)
//		a.method3(); // private (클래스가 다름)
	}

}

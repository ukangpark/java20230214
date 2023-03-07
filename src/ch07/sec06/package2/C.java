package ch07.sec06.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	//메소드 선언
	public void method() { //다른 패키지여서 안됨
		A a = new A();
//		a.field = "value";//안됨
//		a.method();//안됨
	}

}

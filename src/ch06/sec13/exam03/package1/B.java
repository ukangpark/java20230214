package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;
		a.field2 = 1; // default (패키지가 동일하여 가능)
//		a.field3 = 1; // private (같은 클래스가 아니여서 불가능)
		
		//메소드 호출
		a.method1();
		a.method2(); // default (패키지가 동일하여 가능)
//		a.method3(); // private (같은 클래스가 아니여서 불가능)
	}

}

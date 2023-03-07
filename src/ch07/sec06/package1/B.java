package ch07.sec06.package1;

public class B {
	//메소드 선언
	public void method() { //같은 패키지여서 가능
		A a = new A();
		a.field = "value";
		a.method();
	}

}

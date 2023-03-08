package ch08.lecture.p04default_method;

public class MyClass012 implements MyInterface01 {
	@Override
	public void method1() {
		System.out.println("class012 override");
	}
	
	//default 메소드도 재정의 가능
	@Override
	public void method2() {
		System.out.println("class012에서 default 메소드 method2 재정의");
	}
}

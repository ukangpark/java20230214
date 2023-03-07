package ch07.lecture.p08super;

public class C04Super {
	public static void main(String[] args) {

	}
	
}

class Super04 {
	public void method1() {
		System.out.println("Super04 method1");
		
	}
	public void method3() {
		System.out.println("Super04 method3");
	}
}

class Sub04 extends Super04 {
	@Override
	public void method3() {
		System.out.println("Sub04 method3");
		method1(); //Super.이 생략되어있는것 ( = Super.method1(); )
		method3(); //자기자신을 호출
		super.method3();//부모클래스의 method3을 호출
	}
	public void method2() {
		method1(); //Super.이 생략되어있는것 ( = Super.method1(); )
	}
}

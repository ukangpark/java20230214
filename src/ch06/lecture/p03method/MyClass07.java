package ch06.lecture.p03method;

public class MyClass07 {
	//파라미터 개수, 순서, 타입에 맞게
	//아규먼트 전달해야함
	
	//메소드 오버로딩(overloading)
	//메소드 이름이 같아도
	//파라미터 개수, 순서, 타입이 다르면
	//다른 메소드임
	
	void method1(int i) {
		System.out.println("정수 하나 받는 메소드");
	}
	void method1(long i) {
		System.out.println("long 하나 받는 메소드");
	}
	void method1(int i, int j) {
		System.out.println("정수 두개 받는 메소드");
	}
	void method1(String i, int j) {
		System.out.println("문자열 하나, 정수 하나 받는 메소드");
	}
	void method1(int i, String j) {
		System.out.println("정수 하나, 문자열 하나 받는 메소드");
	}
}

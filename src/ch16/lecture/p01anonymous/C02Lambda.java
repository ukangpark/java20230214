package ch16.lecture.p01anonymous;

public class C02Lambda {
	public static void main(String[] args) {
		MyInterface02 o1 = () -> System.out.println("재정의 메소드");//몸통이 한줄이면 중괄호 생략가능
		
		o1.method1();
	}
}

interface MyInterface02 {
	void method1();
}

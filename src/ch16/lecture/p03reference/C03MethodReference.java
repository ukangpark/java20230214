package ch16.lecture.p03reference;

public class C03MethodReference {
	public static void main(String[] args) {
		MyInterface04 o1 = a -> System.out.println(a);
		// 인스턴스 메소드를 호출함
		MyClass03 s1 = new MyClass03();
		MyInterface04 o2 = a -> s1.method1(a);// 호출한것에 불과하다면
		MyInterface04 o3 = s1::method1;// 객체::메소드명

		MyInterface02 o4 = () -> s1.method();
		MyInterface02 o5 = s1::method;

		MyInterface03 o6 = (a, b) -> s1.method2(a, b);
		MyInterface03 o7 = s1::method2;

		MyInterface03 o8 = (a, b) -> s1.method2(b, a);// 순서가 달라서 생략불가
	}

}

interface MyInterface04 {
	void action(int a);
}

class MyClass03 {
	void method1(int a) {

	}

	void method2(int a, int b) {

	}

	void method() {
	}
}

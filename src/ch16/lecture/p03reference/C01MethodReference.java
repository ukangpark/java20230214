package ch16.lecture.p03reference;

public class C01MethodReference {
	public static void main(String[] args) {
		MyInterface01 o1 = a -> System.out.println(a);
		MyInterface01 o2 = a -> MyClass01.method(a);// a가 어떤 값을 받아서 메소드의 a로 넘겨줌

	};

	// method reference (static method 참조)
	MyInterface01 o3 = MyClass01::method;
}

interface MyInterface01 {
	void action(int a);
}

class MyClass01 {
	public static void method(int a) {

	}
}

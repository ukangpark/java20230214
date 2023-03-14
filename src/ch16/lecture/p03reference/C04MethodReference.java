package ch16.lecture.p03reference;

public class C04MethodReference {
	public static void main(String[] args) {
		//instance method 인스턴스 메소드 참조
		//Reference to an instance method
		MyInterface05 o1 = (a, b) -> a.method(b);
		MyInterface05 o2 = MyClass04::method;//인스턴스 메소드참조
	}

}

interface MyInterface05 {
	void action(MyClass04 a, int b);
}

class MyClass04 {
	void method(int a) {
		//받아서 어떤일을 함
	}
}

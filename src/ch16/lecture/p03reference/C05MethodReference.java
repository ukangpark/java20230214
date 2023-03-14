package ch16.lecture.p03reference;

public class C05MethodReference {
	public static void main(String[] args) {
	MyInterface06 o1 = (x) -> x.someMethod();
	MyInterface06 o2 = MyClass06::someMethod;

	}
}

interface MyInterface06 {
	void action(MyClass06 o);
}

class MyClass06 {
	void someMethod() {
		
	}
}

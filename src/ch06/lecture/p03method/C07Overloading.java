package ch06.lecture.p03method;

public class C07Overloading {
	public static void main(String[] args) {
		MyClass07 o1 = new MyClass07();
		
		o1.method1(9);
		o1.method1(278934L);
		o1.method1(3, 99);
		o1.method1("java",9);
	}
}

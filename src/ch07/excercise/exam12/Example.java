package ch07.excercise.exam12;

public class Example {
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.method2();
		}
	}
	public static void main(String[] args) {
		action(new A());//A-method1()
		action(new B());//B-method1()
		action(new C());//C-method1 C-method2()
	}
}

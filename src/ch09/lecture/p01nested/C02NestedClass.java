package ch09.lecture.p01nested;

public class C02NestedClass {
	

}

class MyClass02 {
	class Nested02 {
		
	}
	
	Nested02 item = new Nested02();
	
	void method1() {
		Nested02 local = new Nested02();
	}
}

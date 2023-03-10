package ch09.lecture.p01nested;

public class C01NestedClass {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		//바깥에 있는 클래스의 객체를 먼저만들고 접근해야함.
		MyClass01.Nested01 o2 = o1.new Nested01();
	}

}

//중첩 클래스(nested class)
class MyClass01 {
	//클래스안에 클래스
	//class
	class Nested01 {
		//필드
		//생성자
		//메소드
	}
	
	//필드
	//생성자
	//메소드
	
}

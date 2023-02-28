package ch06.lecture.p04static;

public class MyClass02 {
	
	//static field (class가 가지고 있는 필드 => class field(variable))
	//인스턴스 없이 클래스를 통해서 사용할수있음
	static String name;
	static int age;
	
	//static method (class가 가지고 있는 메소드 => class Method)
	static void greeting() {
		System.out.println(age + "세" + name + "입니다.");
	}

}

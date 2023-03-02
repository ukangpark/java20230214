package ch06.lecture.P07constructor;

public class MyClass07 {
	//필드
	String name;
	int age;
	
	//생성자 오버로딩
	//파라미터 순서, 타입, 갯수에 따라 생성자를 여러개 만들 수 있음
	//기본생성자
	MyClass07() {
		//기본생성자를 만들 수 있음
	}
	//생성자
	MyClass07(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

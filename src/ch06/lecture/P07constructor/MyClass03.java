package ch06.lecture.P07constructor;

public class MyClass03 {
	String name;
	int age;
	
	//생성자
	MyClass03() {
		//최초해야하는일들을 작성(주로필드초기화)
		name = "son";
		age = 77;
	}
	
	void desc() {
		System.out.println("이름: " + name + "나이: " + age);
	}

}

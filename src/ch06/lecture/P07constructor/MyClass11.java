package ch06.lecture.P07constructor;

public class MyClass11 {
	final String name = "son";
	final int age; //생성자에서 값 할당해야함
	
	MyClass11() { //final의 값을 생성자에서 만들 수 있음
		this(99);
//		age = 99;
	}
	
	MyClass11(int age) {
		this.age = age;//값을 한번 받으면 해당 생성자의 인스턴스는 더이상 수정 불가
	}

}

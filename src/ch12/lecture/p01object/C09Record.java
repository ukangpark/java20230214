package ch12.lecture.p01object;

public class C09Record {
	public static void main(String[] args) {
		
	//final필드
	//생성자
	//get set 메소드
	//toString override
	// => 너무많이사용해서 함축적으로 만듦 -> record 선언
	MyClass09 o1 = new  MyClass09("son", 33);
	System.out.println(o1);
	System.out.println(o1.name()); //원래 getName이지만, record선언하면 줄여서 변수명만 호출하면됨
	System.out.println(o1.age()); //원래 getAge이지만, record선언하면 줄여서 변수명만 호출하면됨
	}
}

record MyClass09(String name, int age) {
	
}

package ch06.lecture.p04static;

public class MyClass05 {
	
	//instance field
	String name;
	
	//static field
	static String model;
	
	//instance method
	void printName() {
		//instance member는 static member에 접근 가능
		System.out.println(model);
		System.out.println(name);
	}
	
	//static method
	static void printModel() {
		System.out.println(model);
		//static은 instance member에 접근 불가능
		//System.out.println(name);//안됨
	}

}

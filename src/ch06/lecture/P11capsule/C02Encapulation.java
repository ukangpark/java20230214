package ch06.lecture.P11capsule;

public class C02Encapulation {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		
//		o1.age = 3;
//		o1.age = 30;
		
		System.out.println("나이 : " + o1.getAge());
		o1.updateAge();
		
		System.out.println("나이 : " + o1.getAge());
		o1.updateAge();
		
	}

}

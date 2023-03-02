package ch06.lecture.P10access.package1;

public class C02AccessModifier {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		System.out.println(o1.name);
//		System.out.println(o1.age);//불가능 -> private이니까
		System.out.println(o1.married);//가능 -> 안쓴것 (같은패키지니까)
		
		o1.method1();
//		o1.method2();//접근불가능 -> private이니까
		o1.method3();//접근가능 -> 안쓴것(default)이니까
	}

}

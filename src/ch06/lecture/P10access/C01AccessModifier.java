package ch06.lecture.P10access;

public class C01AccessModifier {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		
		System.out.println(o1.name);
//		System.out.println(o1.age); //접근 불가능 -> age는 private
		
		o1.method1(); //실행(접근) 가능
//		o1.method2(); //실행(접근) 불가능 -> method2는 private
		o1.method3();
	} 

}

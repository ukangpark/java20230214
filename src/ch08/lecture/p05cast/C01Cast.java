package ch08.lecture.p05cast;

public class C01Cast {
	public static void main(String[] args) {
		MyInterface011 o1 = new MyClass011();
//		o1.method1();//안됨 -> 인터페이스에 없으니까
		
		//method1을 사용하고 싶다!
		//인터페이스 강제 형변환 -> 프로그램이 종료되는 위험이 있음
		MyClass011 o2 = (MyClass011)o1;
		o2.method1();
	}
}

package ch06.lecture.p03method;

public class C11Return {
	public static void main(String[] args) {
		MyClass11 o1 = new MyClass11();
		
		System.out.println("메인 코드1");
		o1.method2();//1만 실행됨(return을 만났으니까 다음 실행코드인 2는 실행되지 않고 종료)
		
		System.out.println("메인 코드2");
		
	}

}

package ch16.lecture.p02lambda;

public class C03Lambda {
	public static void main(String[] args) {
		MyInterface03 o1 = new MyInterface03() {
			@Override
			public void method(int a) {
				System.out.println("익명클래스로 재정의");
				System.out.println("받은 값: " + a);
			}
		};
		o1.method(9);
		
		MyInterface03 o2 = (int a) -> {
			System.out.println("람다식으로 재정의");
			System.out.println("받은값: " + a);
		};
		o2.method(10);
		
		//파라미터가 하나 일때 타입 생략가능
		MyInterface03 o3 = (a) -> {
			System.out.println("람다식 파라미터 타입 생략");
			System.out.println("받은값: " + a);
		};
		o3.method(9);
		
		//파라미터가 하나 일때 둥근괄호 생략가능
		MyInterface03 o4 = a -> {
			System.out.println("괄호 생략");
			System.out.println("받은 값: " + a);
		};
		o4.method(1);
		
		//파라미터 명은 일치하지 않아도 됨
		MyInterface03 o5 = x -> {
			System.out.println("파라미터명 정의-달라도되지만 보통 같음");
			System.out.println("받은 값: " + x);
		};
		o5.method(8);
		
	}

}

interface MyInterface03 {
	void method(int a);
}

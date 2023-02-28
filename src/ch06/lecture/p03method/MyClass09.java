package ch06.lecture.p03method;

public class MyClass09 {
	
	void method1() {
		System.out.println("파라미터 없는 메소드");
	}
	
	void method1(int i) {
		System.out.println("파라미터 하나 받은 메소드");
	}
	
	void method1(int i, int j) {
		System.out.println("파라미터 두개 받는 메소드");
	}
	
	void method2(int[] args) {
		for (int arg : args) {
			System.out.println("받은 파라미터: " + arg);
		}
		System.out.println("args주소: " + System.identityHashCode(args));
	}
	
	//가변길이 아규먼트 (varargs)
	void method3(int... args) {
		//값을 받으면 배열로 사용
		for (int arg : args)
		System.out.println("가변길이 파라미터 : " + arg);
		
	}
	
	//가변길이 매개변수는 파라미터 목록에서 가장 오른쪽에 작성해야함
	void method4 (String param, double d, int... values) {
		
	}

}

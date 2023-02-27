package ch06.lecture.p03method;

public class MyClass05 {
	
	void method1() {
		//실행코드
		System.out.println("파라미터 없는 메소드");
	}
	
	void method2(int x, int y) {
		System.out.println(x + " + " + y + " = " + (x + y));
	}
	
	void method3(int line) {
		
		for (int i=0; i<line; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void method4(int param) {
		int var;
		var = 3;
		//파라미터도 변수의 일종 <= 사용할때 변수처럼 사용하기 때문
		//파라미터 값은 호출될 때 결정됨
		//파라미터의 값은 메소드안에서 웬만하면 수정하지 말자
		
		System.out.println(param * var);
		
	}

}

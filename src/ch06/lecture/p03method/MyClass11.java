package ch06.lecture.p03method;

public class MyClass11 {
	
	void method1() {
		System.out.println("실행문1");
		System.out.println("실행문2");
		
		return; // 메소드 종료
		//다음 코드 실행 안됨
		//System.out.println("실행문3");
	}
	
	void method2() {
		System.out.println(1);
		
		if(true) {
			return;//메소드 종료
		}
		
		System.out.println(2);
	}

}

package ch07.lecture.P01inheritance;

public class SubClass04 extends SuperClass04 {
	//override
	//SuperClass04 method1 재정의
	//메소드명 실수로 잘못입력했을 때 검증받기
	@Override // 재정의 메소드인지 컴파일러가 검증함
	//재정의 할 때는 @Override 붙이자
	public void method1() {
		System.out.println("sub method1");
	}
	
	@Override // 어노테이션 (annotation)
	public void method2() {
		System.out.println("sub method2");
	}
}

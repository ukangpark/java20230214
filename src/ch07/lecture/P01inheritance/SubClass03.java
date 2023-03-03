package ch07.lecture.P01inheritance;

public class SubClass03 extends SuperClass03 {

	//우리눈에 안보이지만 슈퍼클래스메소드 2개 가지고 있음
	// 상속받은 메소드를 재정의 할 수 있음
	// = override
	public void method2() {
		System.out.println("서브클래스 메소드2");
	}
	public void method3() {
		System.out.println("서브클래스 메소드3");
	}
}

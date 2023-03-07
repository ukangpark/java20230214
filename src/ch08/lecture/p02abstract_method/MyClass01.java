package ch08.lecture.p02abstract_method;

//구현클래스(구체클래스, concrete class)
public class MyClass01 implements MyInterface01 {
	//추상메소드를 꼭 구현해야함
	@Override
	public void method1() {
		//하위클래스에서 상의클래스의 메소드를 재정의 할때,
		//상위 클래스의 접근제한자보다 작을 수 없음
		System.out.println("구현된 메소드");
	}
	
	public void method2() {
		System.out.println("추가된 메소드");
	}
	

}

package ch13.lecture.p01generic;

public class C05GenericMethod {
	public static void main(String[] args) {
		MyClass05 o1 = new MyClass05();
		o1.<String>method("java");//메소드 호출할때 타입파라미터에 원하는 타입
		o1.<Integer>method(9);
		
		o1.method("spring");//파라미터의 타입으로 타입파라미터가 유추가가능 => 생략하고 쓰는게 대부분이다.
		
	}
	

}

class MyClass05 {
	//클래스 전체 범위 말고, 메소드에만 적용
	//generic method
	public <T> void method(T t) {
		
	}
}

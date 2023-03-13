package ch16.lecture.p02lambda;

public class C01Lambda {
	public static void main(String[] args) {
		//
		MyInterface01 o1 = () -> System.out.println("재정의 메소드");
		o1.method1();
		MyInterface01 o2 = () -> System.out.println("또다른 메소드");
		o2.method1();
	}

}

//lambda expression 람다식:
//추상 메소드가 하나인 interface의 익명클래스 객체 만드는 코드

//functional interface :
//추상 메소드가 하나인 interface

@FunctionalInterface // functionalInterface인지 아닌지 검증하는 어노테이션
interface MyInterface01 {
	void method1();//functional interface
//	void mothod2();//생기는 순간 functional interface가 아님(추상메소드가 2개이상이면 람다식을 만들지 못함)
	
	//Object에 있는 메소드는 추상메소드 수에 포함 안됨 (왜? 재정의한것과 마찬가지기 때문에)
	String toString(); 
	
	//몸통이 있는 default메소드는 추상메소드가 아니기 때문에 추상메소드 수에 카운팅 되지 않음
	default void method2() {
		
	}
}


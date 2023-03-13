package ch09.sec04.exam03;

public class A {
	//메소드
	public void method (int arg) {
		//로컬 변수
		int var = 1;
		
		//로컬 클래스
		class B {
			//메소드
			void mehtod2() {
				//로컬 변수 읽기
				System.out.println("arg: " + arg); //ok
				System.out.println("var: " + var); //ok
				
				//로컬 변수 수정
				//arg = 2; // 안됨
				//var = 2; // 안됨
				
			}
		}
		
		//로컬 객체 생성
		B b = new B();
		//로컬 객체 메소드 호출
		b.mehtod2();
		
		//로컬 변수 수정
		//arg = 3; //안됨
		//var = 3; //안됨
	}

}

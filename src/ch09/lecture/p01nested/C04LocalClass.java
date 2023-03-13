package ch09.lecture.p01nested;

public class C04LocalClass {
	
	void method1() {
		//로컬 클래스 (local class)
		//메소드안에 클래스를 만들수있다.
		//이 메소드 안에서만 사용가능
		//여기서만 쓰고 외부에서는 아예 쓸일이 없을 때 사용
		class LocalClass1 {
			
		}
		
		//클래스가 존재하는 메소드 안이니까 이 메소드 안에서 객체 만들수있음 
		LocalClass1 o1 = new LocalClass1();
	}
	
	void method2() {
//		LocalClass1 o1 = new LocalClass1();//사용불가
	}

}

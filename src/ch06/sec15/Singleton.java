package ch06.sec15;

public class Singleton {
	//private 접근 권한을 갖는 정적 필드 선언과 초기화
	//클래스타입을 가지는 singleton 변수
	// 새로운 주소값을 만들고 singleton변수는 그 주소값을 참조한다.
	private static Singleton singleton = new Singleton();
	
	//private 접근 권한을 갖는 생성자 선언
	private Singleton() {
		
	}
	
	//private 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getInstance() {
		return singleton;
	}

}

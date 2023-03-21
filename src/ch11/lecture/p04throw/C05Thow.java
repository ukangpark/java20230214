package ch11.lecture.p04throw;

public class C05Thow {
	public static void main(String[] args) {
		
	}
	
	//상위타입모두 명시가능(object 제외)
	public static void method2() throws Exception {
		throw new ClassNotFoundException(); //exception -> 메소드 명시 필수
	}
	
	public static void method1() throws RuntimeException {
		
		throw new ClassCastException();//runtimeexception 메소드명시 생략가능
	}

}

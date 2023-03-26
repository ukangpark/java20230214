package ch11.sec02.exam02;

public class ExceptionHandlingExample {
	
	public static void main(String[] args) {
		//forName : 스트링으로 받은 문자열의 클래스가 있다면 클래스정보를 가지고 있는 클래스 객체로 리턴함(있으면 리턴/없으면 exception)
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재함");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재함");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		System.out.println("continue..");//catch를 만나 catch실행문이 실행되어 프로그램이 종료되지않고 다음 흐름을 이어감
	}

}

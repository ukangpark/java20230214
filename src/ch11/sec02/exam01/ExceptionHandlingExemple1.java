package ch11.sec02.exam01;

public class ExceptionHandlingExemple1 {
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수: " + result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null); //null의 length를 호출했기 때문에 예외발생 발생
		System.out.println("[프로그램종료]");
	}
	

}

package ch11.lecture.p01exception;

public class C06CheckedException {
	public static void main(String[] args) {
		try {
		Class.forName("java.lang.Object");
		//컴파일러가 해당 코드는 예외를 발생시킬수도! 있다라고 실행전에 알려줌
		//일반예외! -> 코드를 사용하여 예외를 다룰 수 있음
		//try catch문을 사용하여 exception을 다뤄야함
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("continue");
	}

}

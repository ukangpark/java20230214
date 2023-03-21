package ch11.lecture.p05custom;

public class C03CustomExample {
	public static void main(String[] args) {
		
	MyException1 e = new MyException1();
	MyException1 e1 = new MyException1("some message");//String파라미터를 받는 생성자를 생성하기 않았기 때문에 안됨
	System.out.println(e.getMessage());
	System.out.println(e1.getMessage());
	
	}
}

class MyException1 extends Exception {
	public MyException1() {
	//파라미터가 있는 생성자를 만들었다면 파라미터가 없는 생성자도 수동으로 만들어줘야함
	}
	public MyException1(String message) {
		super(message); //자동적으로 super를 가져옴
		//super에 파라미터로 받는 값을 넣어줘야, 내가 원하는 문자열이 출력
	}
}

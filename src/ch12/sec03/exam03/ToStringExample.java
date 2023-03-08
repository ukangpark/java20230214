package ch12.sec03.exam03;

public class ToStringExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);//왜 객체만넣어도 toString한 값이나옴?
		//객체의 toString의 결과가 출력되도록하는게 println메소드
	}

}

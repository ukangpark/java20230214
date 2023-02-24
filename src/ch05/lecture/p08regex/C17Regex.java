package ch05.lecture.p08regex;

public class C17Regex {
	public static void main(String[] args) {
		
		//앞에 배운것들을 조합해보자
		
		//Java 패턴
		//영문대소문자, $, _, 숫자
		//단, 숫자가 앞에 오면 안됨
		
		String pattern = "[a-zA-Z$_]+[a-zA-Z0-9$_]*";
		
		System.out.println("modelName".matches(pattern));
		System.out.println("class".matches(pattern));
		System.out.println("$value".matches(pattern));
		System.out.println("_age".matches(pattern));
		System.out.println("int".matches(pattern));
		System.out.println("6hour".matches(pattern));
		System.out.println("#name".matches(pattern));
	}

}

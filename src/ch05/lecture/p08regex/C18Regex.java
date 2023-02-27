package ch05.lecture.p08regex;

public class C18Regex {
	public static void main(String[] args) {
		String pattern1 = "[0-9]";
		String pattern2 = "\\d";//\d
		
		System.out.println("0".matches(pattern1));//true
		System.out.println("0".matches(pattern2));//true
		System.out.println("5".matches(pattern2));//true
		System.out.println("9".matches(pattern2));//true
		
		System.out.println("19990112".matches("[0-9]{8}"));
		System.out.println("19990112".matches("\\d{8}"));
		
		//전화번호
		//010으로 시작, -있어도되고 없어도되고, 숫자4개, -있거나없거나, 숫자4개
		String number1 = "01099999999";
		String number2 = "010-88888888";
		String number3 = "010-7777-7777";
		
		String pattern3 = "010-?\\d{4}-?\\d{4}";
		
		System.out.println(number1.matches(pattern3));//true
		System.out.println(number2.matches(pattern3));//true
		System.out.println(number3.matches(pattern3));//true
		
	}

}

package ch05.lecture.p08regex;

public class C10Regex {
	public static void main(String[] args) {
		//quantifier (수량자)
		
		//숫자 3개 인가?
		//{} : 직전에 있는 패턴이 몇번 반복하게 할것인가
		System.out.println("010".matches("[0-9][0-9][0-9]"));
		System.out.println("123".matches("[0-9]{3}"));
		System.out.println("12".matches("[0-9]{3}"));
		System.out.println("1233".matches("[0-9]{3}"));
		System.out.println("ab0".matches("[0-9]{3}"));
	}

}

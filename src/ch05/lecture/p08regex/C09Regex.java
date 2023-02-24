package ch05.lecture.p08regex;

public class C09Regex {
	public static void main(String[] args) {
		//character class
		//negation(not)
		//그 문자를 제외하고 패턴
		
		//숫자가 아니면 일치
		//^ : 어떠한 범위를 제외하고 라는 뜻(negation)
		System.out.println("0".matches("[^0-9]"));//false
		System.out.println("a".matches("[^0-9]"));
		System.out.println("z".matches("[^0-9]"));
		System.out.println(" ".matches("[^0-9]"));
		System.out.println("$".matches("[^0-9]"));
	}

}

package ch05.lecture.p08regex;

public class C05Regex {
	public static void main(String[] args) {
		//character class
		
		System.out.println("a".matches("[abcdefghijklmnopqurstuvwyz]"));
		System.out.println("b".matches("[abcdefghijklmnopqurstuvwyz]"));
		System.out.println("x".matches("[abcdefghijklmnopqurstuvwyz]"));
		
		System.out.println("a".matches("[a-z]"));
		System.out.println("b".matches("[a-z]"));
		System.out.println("x".matches("[a-z]"));
	}

}

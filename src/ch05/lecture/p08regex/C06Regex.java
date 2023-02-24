package ch05.lecture.p08regex;

public class C06Regex {
	public static void main(String[] args) {
		System.out.println("Az".matches("[A-Z][a-z]"));
		System.out.println("Bx".matches("[A-Z][a-z]"));
		System.out.println("Za".matches("[A-Z][A-Z]"));
	}

}

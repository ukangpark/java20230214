package ch05.lecture.p08regex;

public class C21Regex {
	public static void main(String[] args) {
		//word character
		//\w
		
		String pattern1 = "\\w";
		String pattern2 = "[0-9a-zA-Z_]";
		
		System.out.println("a".matches(pattern1));
		System.out.println("a".matches(pattern2));
		System.out.println("A".matches(pattern2));
		System.out.println("X".matches(pattern2));
		System.out.println("_".matches(pattern2));
		
		//영문대소문자 숫자 언더스코어로 이루어진 단어 2개로만 표현된 문자열인지
		String pattern3 = "\\s*\\w+\\s+\\w+\\s*";
		
		System.out.println("Hello World".matches(pattern3));
		System.out.println("Hello      World       ".matches(pattern3));
		System.out.println("  my_name   0108888    ".matches(pattern3));
		
		
	}

}

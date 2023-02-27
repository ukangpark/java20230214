package ch05.lecture.p08regex;

public class C19Regex {
	public static void main(String[] args) {
		//빈칸
		// \s 빈칸기능의 모든 케릭터클래스들을 의미(\t \n \x0B \f)
		
		String pattern1 = "\\s"; //\s
		
		System.out.println(" ".matches(pattern1));//true
		System.out.println("\n".matches(pattern1));//true
		System.out.println("\t".matches(pattern1));//true
		
		//소문자단어 3개로 이루어져있는지?
		String pattern2 = "\s*[a-z]+\s[a-z]+\s[a-z]+\s*";
		System.out.println("hello world java".matches(pattern2));//true
		System.out.println("hello world".matches(pattern2));//false -> 단어가2개여서
		System.out.println("  hello world java    ".matches(pattern2));//true
		System.out.println("helloworldjava".matches(pattern2));//false -> 단어사이 공백이 없어서
		
	}

}

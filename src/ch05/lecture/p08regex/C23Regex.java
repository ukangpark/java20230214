package ch05.lecture.p08regex;

public class C23Regex {
	public static void main(String[] args) {
		// . : 모든문자
		//\. : 문자(.)을 표현
		
		String pattern1 = ".";
		String pattern2 = "\\.";
		
		System.out.println("a".matches(pattern1));//true
		System.out.println("a".matches(pattern2));//false -> 문자(.)만 가능하니까
		
		System.out.println(".".matches(pattern1));//true
		System.out.println(".".matches(pattern2));//true
		
		//영문대소문자여러개 .com으로 끝나는지?
		String pattern3 = "[a-zA-Z]+\\.com";
		System.out.println("daum.com".matches(pattern3));//true
		System.out.println("daum.net".matches(pattern3));//false -> .com으로 끝나지 않아서
		System.out.println("daumcom".matches(pattern3));//false -> 문자(.)이 없어서
		
	}

}

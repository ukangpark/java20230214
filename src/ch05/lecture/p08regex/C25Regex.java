package ch05.lecture.p08regex;

public class C25Regex {
	public static void main(String[] args) {
		//unicode script
		//\p{IsHangul}
		//한글 [가-힣]
		
		String pattern1 = "[가-힣]";
		String pattern2 = "\\p{IsHangul}";
		
		System.out.println("박".matches(pattern1));//true
		System.out.println("박".matches(pattern2));//true
		
		//공백없이 한글두글자 이상
		String pattern3 = "\\p{IsHangul}{2,}";
		
		System.out.println("유강".matches(pattern3));//true
		System.out.println("강".matches(pattern3));//false -> 한글자여서
		System.out.println("박유강".matches(pattern3));//true
	}

}

package ch05.lecture.p08regex;

public class C22Regex {
	public static void main(String[] args) {
		//모든 문자
		//Any character (line terminators : may or may not match)
		//.
		String pattern1 = ".";
		
		System.out.println("a".matches(pattern1));//true
		System.out.println("X".matches(pattern1));//true
		System.out.println("9".matches(pattern1));//true
		System.out.println(" ".matches(pattern1));//true
		System.out.println("\n".matches(pattern1));//\n은 참일수도있고거짓일수도 있음
		
		String pattern2 = ".{3}";
		System.out.println("가나다".matches(pattern2));//true -> 문자3개
		System.out.println("가 다".matches(pattern2));//true -> 스페이스포함3개
		System.out.println("   ".matches(pattern2));//true -> 스페이스 3개
	}

}

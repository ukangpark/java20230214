package ch05.lecture.p08regex;

public class C14Regex {
	public static void main(String[] args) {
		//자주쓰는 기호
		//{1,}
		//+ : 1개 이상
		String pattern1 = "[a-z]{1,}";
		//1이상은 자주쓰임 +와 같은말
		String pattern2 = "[a-z]+";
		
		System.out.println("abc".matches(pattern1));//true
		System.out.println("a".matches(pattern1));//true
		System.out.println("A".matches(pattern1));//false
		//같은 결과
		System.out.println("abc".matches(pattern2));//true
		System.out.println("a".matches(pattern2));//true
		System.out.println("A".matches(pattern2));//false
	}

}

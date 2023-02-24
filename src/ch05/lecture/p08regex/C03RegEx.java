package ch05.lecture.p08regex;

public class C03RegEx {
	public static void main(String[] args) {
		//character class(문자분류)
		
		//"a"는 "[]"로 분류된 문자들중 하나인가
		System.out.println("a".matches("[abc]"));
		System.out.println("b".matches("[abc]"));
		System.out.println("c".matches("[abc]"));
		System.out.println("d".matches("[abc]"));
		
	}

}

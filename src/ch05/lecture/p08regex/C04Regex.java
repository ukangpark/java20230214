package ch05.lecture.p08regex;

public class C04Regex {
	public static void main(String[] args) {
		System.out.println("ab".matches("ab"));//true
		System.out.println("bc".matches("bc"));//true
		
		System.out.println("ab".matches("[abc][abc]"));//true
		System.out.println("aa".matches("[abc][abc]"));//true
		System.out.println("ac".matches("[abc][abc]"));//true
		System.out.println("bc".matches("[abc][abc]"));//true
		System.out.println("cc".matches("[abc][abc]"));//true
		System.out.println("cc".matches("[abc]"));//false
	}

}

package ch05.lecture.p08regex;

public class C15Regex {
	public static void main(String[] args) {
		//자주 쓰는 기호
		//{0,}
		// * : 0개 이상
		
		 String pattern1 = "[0-9]{0,}";
		 String pattern2 = "[0-9]*";
		 
		 System.out.println("".matches(pattern1));
		 System.out.println("".matches(pattern2));
		 
		 System.out.println("2".matches(pattern1));
		 System.out.println("2".matches(pattern2));
		 
		 System.out.println("2a5".matches(pattern1));//false -> 다른 기호가 들어감
		 System.out.println("2a5".matches(pattern2));//false -> 다른 기호가 들어감
	}

}

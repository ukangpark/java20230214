package ch03.lecture.p06string;

public class C03charAt {
	public static void main(String[] args) {
		//charAt
		//특정 위치(index)에 있는 문자 확인
		//return type : char
		
		String str1 = "spring";
		System.out.println("길이: " + str1.length());
		
		char c1 = str1.charAt(0);
		System.out.println(c1);
		
		System.out.println("[1]: " + str1.charAt(1));
		
		System.out.println("[마지막글자]: " + str1.charAt(str1.length()-1));	
		
		
		
	}

}

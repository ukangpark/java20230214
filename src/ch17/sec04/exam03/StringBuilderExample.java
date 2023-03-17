package ch17.sec04.exam03;

public class StringBuilderExample {
	public static void main(String[] args) {
		//StringBuilder vs String
		
		//Stringbuilder는 문자열 수정가능
		//String 문자열 수정 불가
		
		String a = "java"; //hello를 붙이고 싶다.
		String b = "html";
		
		//객체를 만들고 붙여야함
		String c = a + "hello";
		String d = b + "hello";
		
		//새로운 객체를 만들지 않고, e라는 객체의 필드를 변경
		StringBuilder e = new StringBuilder("java");
		StringBuilder f = new StringBuilder("html");
		System.out.println(e); //java
		System.out.println(f); //html
		
		e.append("hello");
		f.append("hello");
		System.out.println(e); //javahello
		System.out.println(f); //htmlhello
		
	}

}

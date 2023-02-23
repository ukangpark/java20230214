package ch05.lecture.p04string;

public class C02String {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = "java";
		String str3 = "java";
		
		//생략하고 리터럴한 값을 주면 문자열을 재사용함 : 스트링만 가지고 있는 특별함
		System.out.println(str2 == str3);// ? -> true
		
		System.out.println(str1 == str2); //false
		
		//문자열을 비교하겠다 : .equals와 함께 사용해야하는것을 기억!
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
	}
	

}

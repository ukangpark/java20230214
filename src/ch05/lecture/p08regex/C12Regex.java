package ch05.lecture.p08regex;

public class C12Regex {
	public static void main(String[] args) {
		//수량 n~m : {n,m}
		//a가 1개부터3개까지의 수량으로 나타낼수있는패턴
		String pattern = "a{1,3}";
		
		System.out.println("a".matches(pattern));
		System.out.println("aa".matches(pattern));
		System.out.println("".matches(pattern)); //false -> 0개여서
		System.out.println("aaaa".matches(pattern)); //false -> 수량을 초과해서
		System.out.println("aab".matches(pattern)); //false -> b가 들어가서
	}

}

package ch05.lecture.p08regex;

public class C11Regex {
	public static void main(String[] args) {
		//010으로 시작하고 - 기호, 숫자 4개, - 기호, 숫자 4개 로 이루어진 패턴인가
		
		String pattern = "010-[0-9]{4}-[0-9]{4}";
		System.out.println("010-9999-7777".matches(pattern));
		System.out.println("010-9227-7874".matches(pattern));
		System.out.println("010-92277874".matches(pattern));
		System.out.println("010-922-7874".matches(pattern));
		System.out.println("01-922-7874".matches(pattern));
		
	}

}

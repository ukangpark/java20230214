package ch02.lecture.p05print;

public class C03Print {
	public static void main(String[] args) {
		// printf 
		// 형식에 맞춰서 출력
		
		System.out.printf("어떤 형식");
		System.out.printf("또 다른 형식");
		
		// %n : 새로운 줄
		System.out.printf("새로운 줄 포함%n새 줄에 출력됨");
		
		// \n : 새로운 줄
		System.out.printf("역슬래시 사용\n새 줄?");
		
		System.out.println();
		// %d : 10진법 정수
		System.out.printf("10진법 정수 %d", 99);
		System.out.printf("%n또다른 정수 %d", 300);
//		System.out.printf("%n또다른 정수 %d", "삼백");
//		System.out.printf("%n정수 %d", "3000");
//		System.out.printf("%n정수 %d", 3.14);
		
		// %f : 10진법 실수
		System.out.printf("%n10진법 실수 %f", 3.14);
		System.out.printf("%n10진법 실수 %f", 9.999);
//		System.out.printf("%n10진법 실수 %f", 3);
//		System.out.printf("%n10진법 실수 %f", "3.14");
		
		// %s : 문자열
		System.out.printf("%n문자열 %s", "hello");
		System.out.printf("%n문자열 %s", "world");
		System.out.printf("%n문자열 %s", 3.14);
		System.out.printf("%n문자열 %s", 99);
		
		
		System.out.printf("%n%s world", "hi");
		System.out.printf("%n%d 숫자", 999);
		System.out.printf("%n...%f....", 3.14);
		
		
		
	}
}






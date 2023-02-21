package ch04.lecture.p05break;

public class C01Break {
	public static void main(String[] args) {
		//break
		//반복문(for, while, do while)종료
		
		while (true) {
			System.out.println("code 1");
			System.out.println("code 2");
			
			if (true) {
			break;
			}
			
			System.out.println("code 3");
			System.out.println("code 4");
		}
		
		System.out.println("다음 실행 코드들..");
	}

}

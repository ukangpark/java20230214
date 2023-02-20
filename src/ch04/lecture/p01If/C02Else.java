package ch04.lecture.p01If;

public class C02Else {
	public static void main(String[] args) {
		// else
		// if의 조건이 false일 경우 실행되는 블럭

		System.out.println("코드 실행 1");

		if (false) {
			System.out.println("코드 실행 2");
			System.out.println("코드 실행 3");
		} else {
			System.out.println("코드 실행 4");
			System.out.println("코드 실행 5"
					
					
					
					
					);
		}
		
		System.out.println("실행 흐름 ... 이어감");
		
		//else 코드 블럭의 명령문이 하나면 {} 생략 가능
		//하지만 꼭 작성!!
		
		if (true) {
			System.out.println("코드 실행 6");
		}else 
			System.out.println("코드 실행 7");
		
		System.out.println("코드 계속 실행됨...");

	}

}

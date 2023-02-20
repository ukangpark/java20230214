package ch04.lecture.p01If;

public class C03Elseif {
	public static void main(String[] args) {
		// else if
		// 위 if (else if)의 조건이 false이면 다른 조건 확인

		System.out.println("code 1");

		if (false) {
			System.out.println("code 2");
		} else if (false) {
			System.out.println("code 3");
		} else if (true) {
			System.out.println("code 4");
		} else if (true) {
			System.out.println("code 5");
		} else {
			System.out.println("code 6");
		}

		System.out.println("실행 이어감...");

	}

}

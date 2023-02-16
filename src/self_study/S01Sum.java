package self_study;

import java.util.Scanner;

public class S01Sum {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요: ");
		int num1 = scanner.nextInt();

		System.out.print("두번째 숫자를 입력하세요: ");
		int num2 = scanner.nextInt();

		int total = num1 + num2;

//		System.out.println("더한 결과: " + (num1 + num2));
		System.out.println("더한 결과: " + total);

	}

}

package ch04.execise;

import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int input = 0;
		int output = 0;
		int balance = 0;
		
		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			String strNum = scanner.nextLine();
			
			if (strNum.equals("1")) {
				System.out.print("예금액> ");
				input += Integer.parseInt (scanner.nextLine());;
				System.out.println();
			}else if (strNum.equals("2")) {
				System.out.print("출금액> ");
				output += Integer.parseInt (scanner.nextLine());
				System.out.println();
			}else if (strNum.equals("3")) {
				System.out.print("잔고> ");
				balance += (input - output);
				System.out.println(balance);
				System.out.println();
			}else if (strNum.equals("4")) {
				run = false;
			}
			
		}
		System.out.println();
		System.out.print("프로그램 종료");
	}

}

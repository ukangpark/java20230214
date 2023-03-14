package ch05.execise;

import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		
		int students = 0;
		int[] scores = null;

		
		int sum = 0;
		int top = 0;

		while (run) {

			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.print("학생수> ");
				students = sc.nextInt();
				scores = new int [students];
			} else if (num == 2) {
				for (int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
				}
			} else if (num == 3) {
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if (num == 4) {
				for (int i = 0; i < scores.length; i++) {
					int x = scores[i];
					for (int j = 0; j < scores.length; j++) {
						int y = scores[j];
						if (x > y) {
							top = x;
						} else if (x < y) {
							top = y;
						}
					}
					sum += scores[i];
				}
				System.out.println("최고점수: " + top);
				System.out.println("평균점수: " + (double)sum/scores.length);
			} else {
				run = false;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}

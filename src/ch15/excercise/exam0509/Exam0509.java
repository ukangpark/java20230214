package ch15.excercise.exam0509;

import java.util.*;

public class Exam0509 {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int students = 0;
		int score = 0;
		
		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1 :
				System.out.print("학생수> ");
				students = sc.nextInt();
				//students = list.size();
				break;
			case 2 :
				System.out.println();
				System.out.print("scores[0] : " );
				score = sc.nextInt();
				list.add(score);
				System.out.print("scores[1] : " );
				score = sc.nextInt();
				list.add(score);
				System.out.print("scores[2] : " );
				score = sc.nextInt();
				list.add(score);
				break;
			case 3 :
				for(int i=0; i<students; i++) {
					System.out.print("scores[" + i + "]: ");
					list.forEach(System.out::println);					
				}
				break;
			case 4 :
				int max = 0;
				int sum = 0;
				for (int a : list) {
					max = Math.max(max, a);
					sum += a;
				}
				
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + sum / list.size());
			default:
				run = false;
				break;
			}
			System.out.println("프로그램 종료");			
		}
	}

}

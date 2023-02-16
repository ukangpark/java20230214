package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C04Arithmetic {
	// 백준 2588
	public static void main(String[] args) {
		String input = """
				472
				385
				""";
		
		Scanner scanner = new Scanner(input);
		
		//int a = scanner.nextInt();
		//int b = scanner.nextInt();
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		
		//int b1 = b % 10;
		//int b2 = (b % 100) / 10;
		//int b3 = (b % 1000) / 100;
		
		int a = num2 / 100;
		int b = (num2 % 100) / 10;
		int c = num2 % 10;
		
		int line1 = num1 * a;
		int line2 = num1 * b;
		int line3 = num1 * c;
		
		int line4 = line1 + (line2*10) + (line3*100);
		
			
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(line4);

		
		
	}
}

package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C03Arithmetic {
	//백준 1008
	public static void main(String[] args) {
		
		String input = "4 5";
		
		Scanner scanner = new Scanner(input);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.println((double)num1 / num2);
		
		
	}

}

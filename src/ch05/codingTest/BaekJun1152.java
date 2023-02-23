package ch05.codingTest;

import java.util.Scanner;

public class BaekJun1152 {
	public static void main(String[] args) {
		//백준 1152
		String input = " The first character is a blank";
		
		Scanner scanner = new Scanner(input);
		
		String line = scanner.nextLine();
		
		String[] arr2 = line.split(" ");
	
		int result = 0;
		
		for (int i=0; i<arr2.length; i++) {
			if (!arr2[i].equals("")) {
				result++;
			}
		}
		
		System.out.println(result);
	}

}

package ch05.codingTest;

import java.util.Scanner;

public class BaekJun9086 {
	// 백준 9086
	public static void main(String[] args) {
		
	String input =  """
					3
					ACDKJFOWIEGHE
					O
					AB
					""";
	
	Scanner sc = new Scanner (input);
	
	int loop = Integer.parseInt(sc.nextLine());
	
	for (int i=0; i<loop; i++) {
	String str = sc.nextLine();
	System.out.print(str.charAt(0));
	System.out.println(str.charAt(str.length()-1));
	}

	}
}

package ch02.lecture.p05print;

import java.util.Scanner;

public class C08Print {
	// =백준11021
	public static void main(String[] args) {

		String input = """
				5
				1 1
				2 3
				3 4
				9 8
				5 2
				""";
		
		Scanner scanner = new Scanner(input);
		int loop = scanner.nextInt();
		
		for(int i = 1; i <= loop; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			int c = a + b;
			
			System.out.printf("Case #%2$d: %1$d%n", c, i);
		}

	}

}

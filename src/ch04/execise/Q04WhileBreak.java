package ch04.execise;

public class Q04WhileBreak {
	public static void main(String[] args) {
		int sum = 0;
		int num1;
		int num2;
		
		while (true) {
			num1 = (int)(Math.random()*6) + 1;
			num2 = (int)(Math.random()*6) + 1;
			
			sum = num1 + num2;
			if (sum == 5) {
				System.out.printf("합이5" + "(%d,%d)%n",num1,num2);			
				break;
			}
			System.out.printf("(%d,%d)%n",num1,num2);			
		}
	}

}

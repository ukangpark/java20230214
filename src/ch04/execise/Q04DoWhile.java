package ch04.execise;

public class Q04DoWhile {
	public static void main(String[] args) {
		
		int dice1;
		int dice2;
		int sum = 0;
		
		do {
			dice1 = (int)(Math.random()*6) + 1;
			dice2 = (int)(Math.random()*6) + 1;
			System.out.printf("(%d, %d)%n", dice1, dice2);
			sum = dice1 + dice2;
		} while (sum != 5);
		
		
	}

}

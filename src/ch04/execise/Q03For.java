package ch04.execise;

public class Q03For {
	public static void main(String[] args) {
		

		int sum = 0;
		for (int i=0; i<=100; i+=3) {
			sum += i;
		}
		System.out.println("3의배수 총합:" + sum);
	}

}

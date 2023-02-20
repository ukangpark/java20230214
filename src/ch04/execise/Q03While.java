package ch04.execise;

public class Q03While {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
//		while (i <= 100) {
//			sum += i;
//			i+=3;
//		}
		
		while (i <= 100) {
			if(i%3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("3의 배수의 총 합: " + sum);
	}

}

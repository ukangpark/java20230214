package ch05.execise;

public class Q07EnhancedFor {
	public static void main(String[] args) {
		
	int[] array = { 1,5,3,8,2};
	int max=Integer.MIN_VALUE;
	
	for (int n : array) {
		if (n > max) {
			max = n;
		}
	}
	
	System.out.println(max);
	}
}

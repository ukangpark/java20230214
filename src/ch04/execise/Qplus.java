package ch04.execise;

public class Qplus {
	public static void main(String[] args) {

		for (int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("문제2");
		for (int a=0; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("문제3");
		for (int x=0; x<5; x++) {
			for(int y=x; y>=0; y--) {
				System.out.print(y);
			}
			System.out.println();
		}
	}
	

}

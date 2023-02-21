package ch04.lecture.p04for;

public class C04For {
	public static void main(String[] args) {
		// 중첩된 for

		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단--------");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d%n", i,j,(i*j));
			}
		}
	}

}

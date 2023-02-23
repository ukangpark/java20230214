package ch05.execise;

public class Q07 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };

//		int result = 0;
//		int x = 0;
//		int y = 0;
//
//		for (int i = 0; i < array.length; i++) {
//			x = array[i];
//			for (int j = 1; j < array.length; j++) {
//				y = array[j];
//				if (x > y) {
//					result = x;
//				} else if (y > x) {
//					result = y;
//				}
//			}
//		}
//		System.out.println(result);
		
		int max = 0;
		for (int i=0; i<array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);
		
	}

}
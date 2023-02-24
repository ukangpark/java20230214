package ch05.execise;

public class Q08EnhancedFor {
	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};
		int cnt = 0;
		int sum = 0;
		
//		for(int i=0; i<array.length; i++) {
//			cnt += array[i].length;
//			for (int j=0; j<array[i].length; j++) {
//				sum += array[i][j];
//			}
//		}
		
//		for(int i=0; i<array.length; i++) {
//			int[] brray = array[i];
//		}
		
		for (int[] brray : array) {
			for (int n : brray) {
				System.out.println(n);
				sum += n;
				cnt++;
			}
		}
		System.out.println("합: " + sum);
		System.out.println("평균: " + (double)sum / cnt);
	}

}

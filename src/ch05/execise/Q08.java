package ch05.execise;

public class Q08 {
	public static void main(String[] args) {
		double cnt = 0;
		int sum = 0;
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		for (int i=0; i<array.length; i++) {
			cnt += array[i].length;
			for (int j=0; j<array[i].length; j++) {
				sum += array[i][j];
			}
		}
		System.out.println(sum);
		System.out.println(sum / cnt);
	}

}

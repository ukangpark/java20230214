package ch05.lecture.p03matrix;

public class C03Matrix {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 2, 3, 4, 5 };

		// mat1의 행(원소)는 3
		// 각 행의 원소는 4
		int[][] mat1 = new int[][] {
				new int[] { 3, 4, 5, 7 },
				new int[] { 10, 11, 12, 13 },
				new int[] { 9, 8, 7, 6 }
		};

		// 생략가능
		int[] arr2 = { 2, 3, 4, 5 };
		int[][] mat2 = {
				{ 3, 4, 5, 6 },
				{ 10, 11, 12, 13 },
				{ 9, 8, 7, 6 }
		};
		
		//(각 행의 원소는 같을 필요가 없음)
		int[][] mat3 = {
				{1,2,3,4},
				{10,20},
				{99,100,101}	
		};
	}

}

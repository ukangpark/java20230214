package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C04ArrayCopy {
	public static void main(String[] args) {
		//책 188쪽
		int[] origin = {9,8,7,6,5,4};
		int[] target = new int[origin.length];
		
		//2:원본배열의 시작 인덱스 4:타겟배열의 시작 인덱스 5:몇개복사갯수(똑같이 복사할꺼면 원본의 길이)
		System.arraycopy(origin, 1, target, 1,  0);
		
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(target));
		
		origin[0] = 99;
		
		System.out.println(Arrays.toString(origin));//99
		System.out.println(Arrays.toString(target));//9
		
		
	}

}

package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C03CopyOf {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		
		//파라미터 : 원본배열, 타겟배열길이 (복사하는 거니까 길이를 같게만들어줘야함)
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1[0] = 99;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
	
	
	

}

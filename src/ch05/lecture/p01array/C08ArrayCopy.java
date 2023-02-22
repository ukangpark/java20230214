package ch05.lecture.p01array;

public class C08ArrayCopy {
	public static void main(String[] args) {
		// 각각의 다른 배열을 만들고 아이템 복사
		
		int[] arr1 = {3,4,5};
		
		int[] arr2 = {10, 20, 30};
		int[] arr3 = new int[arr2.length];
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[i] = arr2[i];
		}
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		arr2[0] = 100;
		
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
	}

}

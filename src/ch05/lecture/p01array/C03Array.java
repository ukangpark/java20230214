package ch05.lecture.p01array;

public class C03Array {
	public static void main(String[] args) {
		//배열 만들고 값 할당
		int[] arr1 = new int[3];
		arr1[0] = 9;
		arr1[1] = 7;
		arr1[2] = 5;
		
		//배열을 만들 때 초기값을 생성
		//아이템의 갯수가 곧 길이가 됨으로 갯수입력 할 필요 없음
		int[] arr2 = new int[] {9, 7, 5};
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		//배열을 먼저 선언하고 초기값은 나중에 생성
		int[] arr3;
		arr3 = new int[] {10,20,30,40};
		
		for(int i = 0; i < 4; i++) {
			System.out.println(arr3[i]);
		}
	}

}

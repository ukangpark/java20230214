package ch05.lecture.p06for;

public class C01EnhancedFor {
	public static void main(String[] args) {
		int[] arr1 = { 4, 3, 8, 6 };
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		//enhanced for (탐색할때 코드가 너무 길어서 나타남)
		//향상된 for / foreach
		//인덱스 없이 탐색이 가능 for (탐색할 배열의 타입 새로 담을 변수 : 탐색할 배열의 이름)
		for (int n : arr1) {
			System.out.println(n);
		}
	}

}

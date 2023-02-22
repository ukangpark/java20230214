package ch05.lecture.p01array;

public class C01Array {
	public static void main(String[] args) {
		//Array (배열)
		//여러 값을 가진 자료형(data type)
		//값의 순서가 있음
		//순서는 0번부터 매김..(0,1,2,,)
		
		int a; //기본 타입
		a = 3;
		
		int[] arr1; //배열 타입 (각 값(원소or아이템)의 타입이 int인)
		arr1 = new int[3]; //아이템의 수 정의 => 아이템을 3개 담을 수 있는 배열
		
		arr1[0] = 2;
		arr1[1] = 5;
		arr1[2] = 10;
		
		a = arr1[0];
		System.out.println(a);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		arr1[0] = 99;
		System.out.println(a);//3
		System.out.println(arr1[0]);//99
		
		//for와 궁합이 잘 맞는 자료형
		int[] arr2;
		arr2 = new int[4];
		
		arr2[0] = 99;
		arr2[1] = 100;
		arr2[2] = 200;
		arr2[3] = 1000;
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		
		//인덱스를 반복문으로 줄일 수 있음
		for (int i = 0; i < 4; i++) { // i <= 3으로도 쓸 수 있지만 보통 길이로 적음
			System.out.println(arr2[i]);
		}
	}

}

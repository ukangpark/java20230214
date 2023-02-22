package ch05.lecture.p02reference;

public class C05Reference {
	public static void main(String[] args) {
		int[] arr = {2,4,6};//#7979
		int[] arr2 = arr;//#7979
		
		System.out.println(arr2[0]);//2
		
		arr = new int[] {2,4,6};//#8989
		
		System.out.println(arr[0]);//2
		arr[0] = 20;
		System.out.println(arr[0]);//20
		
		System.out.println(arr2[0]); //? -> 2
	}

}

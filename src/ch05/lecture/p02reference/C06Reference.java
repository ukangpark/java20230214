package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] arr = new int[] {2,4,6};
		
		method1(arr);//7979
		
		System.out.println(arr[0]);//2
		
	}
	
	public static void method1 (int[] arr) {//7979
		arr/*8989*/= new int[] {3,5,7};//8989
	}

}

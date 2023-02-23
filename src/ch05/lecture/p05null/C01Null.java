package ch05.lecture.p05null;

public class C01Null {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2};
		arr1 = null; //참조하는 객체 없음 => null이라는 변수값을 가짐(참조값을 가지지 않음)
		
		int len = arr1.length; //참조하는 객체 없음 예외 발생
		int val = arr1[0];
		
		System.out.println("실행 흐름..");
		
	}

}

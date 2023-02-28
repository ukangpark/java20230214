package ch06.lecture.p06final;

public class C01Final {
	public static void main(String[] args) {
		
	//더이상 값을 변경할수없음
	//값을 한번만 할당할 수 있음
	//값을 한번 할당하면 변경 불가 

	int a = 3;
	a = 5;
	
	final int b = 5;
//	b = 10;//안됨

	}
	
	static void method(int i) {
		System.out.println(i);
		i = 5;
		System.out.println(i);
	}
	
	static void method2(final int i) {
		System.out.println(i);
//		i = 9;//안됨
		System.out.println(i);
	}
}

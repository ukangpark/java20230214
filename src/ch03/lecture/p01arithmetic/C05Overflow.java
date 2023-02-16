package ch03.lecture.p01arithmetic;

public class C05Overflow {
	public static void main(String[] args) {
		
		int a = 15_0000_0000;
		int b = 17_0000_0000;
		
		System.out.println(a);
		System.out.println(b);
		
		//overflow : 타입의 최대 허용값 벗어남
		int c = a + b;
		System.out.println(c);
		
		int d = -15_0000_0000;
		int e = -17_0000_0000;
		
		System.out.println(d);
		System.out.println(e);
		
		int f = d + e;
		System.out.println(f);
		
		long g = d + e;
		System.out.println(g);
		
	}

}

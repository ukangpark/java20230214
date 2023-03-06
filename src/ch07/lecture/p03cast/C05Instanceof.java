package ch07.lecture.p03cast;

public class C05Instanceof {
	public static void main(String[] args) {
		//실제 인스턴스의 타입이 중요(instanceof결과가 그때그때다른이유)
		method1(new Sub05()); // -> true true
		method1(new Super05()); // -> true false
	}

	public static void method1(Super05 s) {
		System.out.println(s instanceof Super05);//true
		System.out.println(s instanceof Sub05);//그때그때 다름
	}
	
}

class Super05 {}
class Sub05 extends Super05 {}

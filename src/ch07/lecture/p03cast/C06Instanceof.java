package ch07.lecture.p03cast;

public class C06Instanceof {
	public static void main(String[] args) {
		Super06 o1 = new Sub06();
		
		//오류가 나지 않지만 강제형변환하기전에 안전하게 코드를 점검할 코드가 필요함
		if (o1 instanceof Sub06) {
		//강제형변환해줌
		Sub06 o2 = (Sub06) o1;
		//o2객체도 Sub6에 있는 메소드를 참조할 수 있음
		o2.method1();
		}
	}
}

class Super06 {}

class Sub06 extends Super06 {
	public void method1() {
		System.out.println("sub06 method1");
	}
}

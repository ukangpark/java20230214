package ch03.lecture.p04logical;

public class C04ShortCircult {
	public static void main(String[] args) {
		//||
		// true || true : true
		// true || false : true
		//앞이 true면 뒤의 결과 보지 않고 바로 연산결과가 나옴(=쇼트서킷)
		// false || true : true
		// false || false : false
		
		int x = 10;
		
		if((x++ > 100) || (x++ < 10)) {
			System.out.println("실행됨1");
		}
		System.out.println(x);
		
		x = 10;
		if ((x++ > 100) || (x++ > 0)) {
			System.out.println("실행됨2");
		}
		System.out.println(x);
		
		x = 10;
		if((x++ > 0) || (x++ < 100)) {
			System.out.println("실행됨3");
		}
		System.out.println(x);
		
		x = 10;
		if ((x++ > 0) || (x++ < -100)) {
			System.out.println("실행됨4");
		}
		System.out.println(x);
		
		
	}

}

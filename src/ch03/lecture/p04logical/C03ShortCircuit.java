package ch03.lecture.p04logical;

public class C03ShortCircuit {
	public static void main(String[] args) {
		//&&
		//true && true : true
		//앞이 true이면 뒤의 결과로 인해 연산결과가 나옴
		//false && true : false
		//앞이 false면 뒤의 결과 보지 않고 바로 연산결과가 나옴(=쇼트서킷)
		
		int x = 10;
		if ((x++ > 0) && ( x++ < 100)) {
			System.out.println("실행됨1");
		}
		System.out.println(x);
		
		x = 10;
		if ((x++ > 0) && (x++ < 5)) {
			System.out.println("실행됨2");
		}
		System.out.println(x);
		
		x = 10;
		if ((x++ > 100) && (x++ < 200)) {
			System.out.println("실행됨3");
		}
		System.out.println(x);
		
		x = 10;
		if ((x++ > 100) && (x++ < 0)) {
			System.out.println("실행됨4");
		}
		System.out.println(x);
	}

}

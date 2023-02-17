package ch03.lecture.p02assignment;

public class C01Assignment {
	public static void main(String[] args) {
		//할당(대입) 연산자
//		=, -=, +=, *=, /=, %=
		
		int x = 10;
		
		x += 30;// x = x + 30;
		System.out.println(x);
		
		x -= 20; // x = x - 20;
		System.out.println(x);
		
		x *= 3;
		System.out.println(x);
		
		x /= 7; //x = x / 7
		System.out.println(x);// 출력값 8!!
		
		x %= 3; //x = x % 3
		System.out.println(x);
	}

}

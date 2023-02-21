package ch04.lecture.p04for;

public class C02For {
	public static void main(String[] args) {
		//변수 scope
		
		int i = 0;
		while (i < 3) {
			System.out.println("while loop");
			i++;
		}
		
		for (int j = 0; j < 3; j++) {
			System.out.println("for loop");
		}
		
		System.out.println(i);
//		System.out.println(j);// j는 for문안에서 선언되었기 때문에 밖에서 사용불가
		//밖에서 쓰고 싶다면 선언을 밖에해주면 됨
		int a;
		for (a = 0; a < 3; a++) {
			System.out.println("for loop");
		}
	}

}

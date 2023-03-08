package ch12.lecture.p01object;

public class C11Enum {
	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);
		
		Season s1 = Season.SPRING;
		Season s2 = Season.SUMMER;
		Season s3 = Season.FALL;
		Season s4 = Season.WINTER;
		//자동으로 순서를 정함 (내가 작성한 순서대로 0부터시작)
		System.out.println(s1.ordinal());//0
		System.out.println(s2.ordinal());//1
		System.out.println(s3.ordinal());//2
		System.out.println(s4.ordinal());//3
		
		Season s5 = Season.valueOf("SPRING");
		Season s6 = Season.valueOf("SUMMER");
		Season s7 = Season.valueOf("FALL");
		Season s8 = Season.valueOf("WINTER");
		
		System.out.println(System.identityHashCode(s1));//같은참조값 
		System.out.println(System.identityHashCode(s5));//같은참조값 왜? 
												//-> 이미 enum에서 객체가 자동으로 만들어졌기때문에 새로운 변수에 담아서 사용만한것
	}

}

enum Season {
	//값의 이름을 나열하기만 하면됨
	//고정된 값을 가짐
	//자동으로 toString값을 생성함
	//자동으로 순서를 정함
	SPRING, SUMMER, FALL, WINTER
}

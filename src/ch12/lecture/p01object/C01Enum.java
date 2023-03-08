package ch12.lecture.p01object;

public class C01Enum {
	public static void main(String[] args) {
		System.out.println(MyClass10.SPRING); //1
		System.out.println(MyClass10.SUMMER); //2
		System.out.println(MyClass10.FALL); //3
		System.out.println(MyClass10.WINTER); //4
	}

}

class MyClass10 {
	//상수값들만 가질수있는 경우가 있음
	//ex. 계절을 표현하는 값을 저장
	static final int SPRING = 1;
	static final int SUMMER = 2;
	static final int FALL = 3;
	static final int WINTER = 4;
	//=>너무길어서 불편하다
}

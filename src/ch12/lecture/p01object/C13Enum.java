package ch12.lecture.p01object;

public class C13Enum {
	public static void main(String[] args) {
		Season season = Season.FALL;
		
		String a = switch (season) {
		case SPRING, FALL -> "좋은 계절이다";
		case SUMMER -> "덥다";
		case WINTER -> "춥다";
//		default -> "잘못입력";//생략가능 왜? Enum이니까 상수의 갯수만큼의 값만 들어올수있음
		};
	}

}

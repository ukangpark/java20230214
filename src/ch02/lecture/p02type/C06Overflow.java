package ch02.lecture.p02type;

public class C06Overflow {
	public static void main(String[] args) {
		int i1 = 2147483647;
		//예상의 범위를 넘어버림(overflow)
		int i2 = i1 + 1;
		
		System.out.println(i1);
		System.out.println(i2);//overflow 발생
	}

}

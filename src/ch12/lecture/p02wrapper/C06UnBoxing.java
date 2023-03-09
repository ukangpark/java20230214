package ch12.lecture.p02wrapper;

public class C06UnBoxing {
	public static void main(String[] args) {
		int i1 = 30000;
		int i2 = 30000;
		
		Integer o1 = i1;
		Integer o2 = i2;
		
		//참조타입에서 동등연산은 참조값이 나옴
		//참조타입에서는 equals를 쓰자
		System.out.println(o1 == o2);//false
		
		int i3 = o1;
		int i4 = o2;
		
		//auto unboxing이 일어나서 기본타입 동등연산
		System.out.println(i3 == i4);
	}

}

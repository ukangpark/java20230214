package ch12.lecture.p02wrapper;

public class C07Unboxing {
	public static void main(String[] args) {
		Integer i1 = 30000;
		
		int r1 = i1 + 50000;
		
		System.out.println(r1);//auto unboxing
		
		Object o1 = 30000;//autoboxing, type conversion
//		int r2 = o1 + 50000;//안됨 (자동형변환안됨->Object는 int라고 할 수 없음)
		
		int r3 = ((Integer)o1) + 50000;//위험한 코드
		int r4 = ((int) o1) + 50000;
	}

}

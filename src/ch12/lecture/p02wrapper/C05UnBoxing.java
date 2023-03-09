package ch12.lecture.p02wrapper;

public class C05UnBoxing {
	public static void main(String[] args) {
		Integer i1 = 30; //auto boxing
		
		int i2 = 50;
		
		//기본타입과 참조타입의 산술연산
		
		//지금 버전(자동으로 언박싱해줌)
		int i3 = i1 * i2;
		
		//예전버전(수동으로 언박싱)
		int i4 = i1.intValue() * i2;
		
		//즉, 
		int i5 = i1.intValue();//unboxing (old)
		int i6 = i1; //auto unboxing (new)
	}

}

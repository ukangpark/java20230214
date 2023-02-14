package ch02.lecture.p01type;

public class C08Double {
	public static void main(String[] args) {
		//실수
		//float(4bytes), double(8bytes)
		
		int i1 = 3;
//		il = 1.4; //x float를 사용해야함
		
		double d1 = 1.4;
		d1 = 99.999;
		d1 = 3;
		d1 = 99;
		
		float f1 = 1.4F;
		f1 = 3;
		
		//사용시 주의
		//10진법 -> 2진법 으로 바꿔서 저장
		//실제로 인식하는 실수는 2진법으로 바꾸면 무한히 반복되는 수로 표현되어 근사한 값으로 저장되기 때문에
		//연산결과가 다를 수 있다.
		double d2 = 0.1;
		double d3 = 0.2;
		
		double d4 = d2 + d3;
		
		System.out.println(d4);
	}

}

package ch06.lecture.p03method;

public class C06Parameter {
	public static void main(String[] args) {
		//자동형변환
		int a = 3;
		long b = a;
		double c = b;
		
		MyClass06 o1 = new MyClass06();
		o1.method1(33);
		o1.method1('c');//문자열도 정수로 자동형변환가능!
		
		o1.method2(23489382365823923L);
		o1.method2(33);
		o1.method2('d');
		
		o1.method3(3.14);
		o1.method3(92745789458923648L);
		o1.method3(55);
		
		o1.method4(3.14f);//"float파라미터 하나 받는 메소드"
		o1.method4(298342L);//"float파라미터 하나 받는 메소드"
		o1.method4(99);//"float파라미터 하나 받는 메소드"
		//o1.method4(3.14);//안됨
		
	}

}

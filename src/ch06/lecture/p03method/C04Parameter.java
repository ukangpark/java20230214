package ch06.lecture.p03method;

public class C04Parameter {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();
		o1.method1();
		
		//메소드실행시 정의된 파라미터 타입과 순서, 개수에 맞춰서
		//아규먼트 입력(전달)
		//o1.method1(3);//안됨
		
		o1.method2(0);
		
		//o1.method2(); //안됨
		
		o1.method3("hello");
		
		String s1 = "java";
		
		o1.method3(s1);
		
		o1.method3(null);
		
		String s2 = null;
		
		o1.method3(s2);
		
		o1.method6(1, "A");
	}

}

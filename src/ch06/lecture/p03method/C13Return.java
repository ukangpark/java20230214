package ch06.lecture.p03method;

public class C13Return {
	public static void main(String[] args) {
		MyClass13 o1 = new MyClass13();
		//호출한곳
		int var1 = o1.method1();//=> 3(리턴한값)으로 치환된것과 같음
		//사용할거면 변수에 담아서 쓰기
		System.out.println(var1);
		
		int var2 = o1.method1() * 2;
		
		System.out.println(var2);
		
		//o1.method1이 값으로 치환된것과 같으니까 코드의 파라미터로 넣어도 됨
		System.out.println(o1.method1());
		
		String var3 = o1.method2();
		System.out.println(var3);
		
		String var4 = o1.method2() + "java";
		System.out.println(var4);
		
		System.out.println(o1.method2());
				
		//자동형변환 (o1.method1()이 정수이니까)
		long var5 = o1.method1();
	}

}

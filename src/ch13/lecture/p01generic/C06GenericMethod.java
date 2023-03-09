package ch13.lecture.p01generic;

public class C06GenericMethod {
	public static void main(String[] args) {
		MyClass06 o1 = new MyClass06();
		o1.<String>method("somebody");
		
		String s1 = o1.<String>method("help me");
		Integer s2 = o1.<Integer>method(5);
		
		String s3 = o1.method(";)");//변수의 타입때문에 타입아규먼트가 유추가능 생략해서 씀
		
	}

}

class MyClass06 {
	public <T> T method(T t) {
		System.out.println(t);
		return t;
	}
}
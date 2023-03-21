package ch11.lecture.p04throw;

public class C10Throw {
	
	public static void main(String[] args) throws ClassNotFoundException {
		method2(); //잡거나 던지거나 둘중에 하나 하면 됨
	}
	
	public static void method2() throws ClassNotFoundException {
		method1(); //던진걸 잡지않으면, 가지고있는 메소드도 던질 수 있음
	}
	
	public static void method1() throws ClassNotFoundException {
		
	}

}

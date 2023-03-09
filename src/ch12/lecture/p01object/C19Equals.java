package ch12.lecture.p01object;

public class C19Equals {
public static void main(String[] args) {
	Object o1 = new MyClass19();
	Object o2 = new MyClass19();
	Object o3 = o1;
	
	System.out.println(o1.hashCode());//33
	System.out.println(o2.hashCode());//33
	System.out.println(o3.hashCode());//33
	
	System.out.println(o1.equals(o3));//true
	System.out.println(o1.equals(o2));//true
	System.out.println(o3.equals(o1));//true
	System.out.println(o2.equals(o3));//true
}
}

class MyClass19 {
	
	@Override
	public int hashCode() {
		return 33;
	}
	
	//equals메소드 재정의
	@Override
	public boolean equals(Object obj) {
		return true; //항상 같게 나오려면 해쉬코드도 같게 재정의 해야함
	}
}

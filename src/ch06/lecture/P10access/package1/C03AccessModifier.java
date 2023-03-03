package ch06.lecture.P10access.package1;

public class C03AccessModifier {
	public static void main(String[] args) {
		//MyClass03과 같은 패키지
		MyClass03 o1 = new MyClass03();
//		MyClass03 o2 = new MyClass03(5);//안됨 private
		MyClass03 o3 = new MyClass03("Hello");//접근가능 package private
	}

}

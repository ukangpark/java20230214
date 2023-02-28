package ch06.lecture.p04static;

public class C03Instance {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		o1.name = "son";
		MyClass03 o2 = new MyClass03();
		o2.name = "park";
		
		o1.hello();
		o2.hello();
		
	}
	

}

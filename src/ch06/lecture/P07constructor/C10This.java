package ch06.lecture.P07constructor;

public class C10This {
	public static void main(String[] args) {
		MyClass10 o1 = new MyClass10("son", 33, "1/2");
		MyClass10 o2 = new MyClass10("park", 13);
		MyClass10 o3 = new MyClass10("cha");
		
		o1.printField();
		o2.printField();
		o3.printField();
		
		
		
	}

}

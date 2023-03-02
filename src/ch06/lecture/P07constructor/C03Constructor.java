package ch06.lecture.P07constructor;

public class C03Constructor {
	public static void main(String[] args) {
		 MyClass03 o1 = new MyClass03();
		 o1.name = "park";
		 o1.age = 66;
		 MyClass03 o2 = new MyClass03();
		 o2.name = "cha";
		 o2.age = 22;
		 //생성자를 만들기전과 다를게 없음
		 o1.desc();
		 o2.desc();
	}

}

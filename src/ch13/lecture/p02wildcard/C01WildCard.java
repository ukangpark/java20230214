package ch13.lecture.p02wildcard;

public class C01WildCard {
	public static void main(String[] args) {
		MyClass01<Object> o1 = new MyClass01<>();
		MyClass01<String> o2 = new MyClass01<String>();
	
		o1.item = new Object();
		o2.item = new String();
		
		o1.item = new String();
//		o2.item = new Object();//안됨 -> Object는 String이라고 할 수 없음
		
		MyClass01<Object> o3 = new MyClass01<String>();//안됨
		MyClass01<Object> o4 = new MyClass01<Object>();//됨
		o3.item = new Object();// 안됨 Object는 String이 될 수 없음
		o4.item = new Object();//됨
		
	}

}

class MyClass01<T> {
	public T item;
	
}

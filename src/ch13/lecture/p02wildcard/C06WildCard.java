package ch13.lecture.p02wildcard;

public class C06WildCard {
	public static void main(String[] args) {
		MyClass06<Object> o1 = new MyClass06<Object>();
		MyClass06<Object> o2 = new MyClass06<String>();//불가
		//상위든 하위든 상관없이 다받고 싶을때
		MyClass06<?> o3 = new MyClass06<Object>();
		MyClass06<?>/*Object의 하위타입인게 명확함*/ o4 = new MyClass06<String>();
	
	}
	

}

class MyClass06<T> {
	public T item;
}

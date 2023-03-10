package ch13.lecture.p02wildcard;

public class C05WildCard {
	public static void main(String[] args) {
		MyClass05<Object> o1 = new MyClass05<Object>();
		addItem(o1);
		
		MyClass05<Number> o2 = new MyClass05<Number>();
		addItem(o2);
		
		MyClass05<Integer> o3 = new MyClass05<Integer>();
		//addItem(o3);//안됨 param으로 들어가게 되면 MyClass05<? super Number> = new MyClass05<Integer>() 가 되는 것이기 때문
	}
	
	public static void addItem(MyClass05<? super Number> param) {
		//out(param에 무엇을 넣으려고 사용)
		param.setItem(3);
		param.setItem(3.14);
	}
}

class MyClass05<T> {
	private T item;
	
	
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}

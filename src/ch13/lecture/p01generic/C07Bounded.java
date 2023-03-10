package ch13.lecture.p01generic;

import java.util.*;

public class C07Bounded {
	public static void main(String[] args) {
		MyClass07<String> o1 = new MyClass07<>();
		o1.setItem("java");
		o1.printItem();
		
		MyClass07<Scanner> o2 = new MyClass07<>();
		o2.setItem(new Scanner(""));
		o2.printItem();
		
		MyClass07<Integer> o3 = new MyClass07<>();
		o3.setItem(3);
		o3.printItem();
	}
}
class MyClass07<T> {
	//Object 메소드 안전하게 실행 가능
	//왜냐하면 Object는 모든 클래스의 상위 클래스 이니까
	//but, 타입의 상한선을 제한한다면???
	//ex, Number는 wrapper의 상위 타입. Number타입으로 제한한다면, Number가 가지고 있는 메소드들은 안전하게 실행시킬수있음
	private T item;//오브젝트 하위타입이기때문에 object가 가지고있는 메소드 실행가능
	
	public void printItem() {
		String str = item.toString();
		int hashCode = item.hashCode();
		boolean equals = item.equals(null);
		System.out.println(str + hashCode + equals);
	}
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
}

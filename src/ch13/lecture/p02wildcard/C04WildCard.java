package ch13.lecture.p02wildcard;

import java.util.*;

public class C04WildCard {
	public static void main(String[] args) {
		MyClass04<Number> o1 = new MyClass04<>();
		printItem(o1);
		
		MyClass04<Integer> o2 = new MyClass04<>();
		printItem(o2);
		
		MyClass04<Double> o3 = new MyClass04<>();
		printItem(o3);
		
	}
	
	public static void printItem(MyClass04<? extends Number > param) {//<Number>로 하면 <Integer>,<Double>전부 실행불가
		//in
		Number num = param.getItem();//param의 item을 Number타입으로 안전하게 꺼낼수있음
		//Number타입으로 안전하게 꺼낼수있으니까, Number타입의 메소드 사용가능
		System.out.println(num.doubleValue() * num.doubleValue());
		
	}

}

class MyClass04<T> {
	
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
}

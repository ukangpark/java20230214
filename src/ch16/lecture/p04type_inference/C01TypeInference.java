package ch16.lecture.p04type_inference;

import java.util.*;

public class C01TypeInference {
	//타입 추론
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();//객체의 타입과 만들어진 인스턴스의 타입이 일치해야함
		Box<String> box2 = new Box<>();//인스턴스를 만드는 객체를 추론가능하여 생략함
		
		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		List<List<Integer>> list2 = new ArrayList<>();
		
		MyInterface01 o1 = (int a, String b) -> b;
		MyInterface01 o2 = (a,b) -> b;
		
	}

}

interface MyInterface01 {
	String action(int a, String b);
}

class Box<T> {
	private T t;
}
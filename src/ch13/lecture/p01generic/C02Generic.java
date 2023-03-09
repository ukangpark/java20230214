package ch13.lecture.p01generic;

import java.util.*;

public class C02Generic {
	public static void main(String[] args) {
		MyClass02<String> o1 = new MyClass02<String>();//T가 모두 String으로
		o1.setItem("java");
		String s1 = o1.getItem();
		System.out.println(s1);
		System.out.println(s1.length());//String이 가지고 있는 메소드도 당연히 사용가능
		
		MyClass02<Scanner> o2 = new MyClass02<Scanner>();
		o2.setItem(new Scanner(""));
		//강제타입변환없이 안전하게 실행시킬수있음
		Scanner sc = o2.getItem();
		sc.hasNext();//스케너가 가지고있는메소드 안전하게 실행시킬수있음
		
//		MyClass02<int> o3;//안됨 -> 기본타입은 타입아규먼트로 사용불가 => wrapper타입으로 사용하면됨
		
		MyClass02<Integer> o3 = new MyClass02<Integer>();
		o3.setItem(33);//autoboxing
		int i = o3.getItem();//unboxing
		System.out.println(i);
	}
	

}
//T타입을 나중에 받겠다.<T>
//T : type parameter
//type parameter 작성관습 : 대문자 한글자
//원소로 쓰이는 타입이면 : E
//키의 용도로 쓰이는 타입이면 : K
//타입자체를 아무거나 받고 싶다 : T
	//차례대로 다음 것의 타입 S,U,V
//키의 용도가 값이면 : V

//아직 타입을 정하지 못했을 때 뭐가 올지 모르기때문에 <타입파라미터 작성>
class MyClass02<T> {
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}

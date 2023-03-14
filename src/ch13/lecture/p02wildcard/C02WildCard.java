package ch13.lecture.p02wildcard;

public class C02WildCard {
	public static void main(String[] args) {
		//프로그램기준으로 값이 나갈 때는 out
		//프로그램기준으로 값이 들어올 때는 in
		//값이 나갈 때(out)는 super
		//와일드카드 : 범위를 넓혀주는 것
//		MyClass02<Object> o3 = new MyClass02<String>();//안됨
		MyClass02<? super String> o1 = new MyClass02<String>();
		MyClass02<? super String> o2 = new MyClass02<Object>();
		o2.item = new String();//String 또는 그 하위타입을 대입 가능
//		o2.item = new Object();//안됨 -> 타입이 이미 String 
		//프로그램기준으로 값이 출력되는 거니까 out에 해당
//		String s1 = o1.item;//String에 할당은 불가(꺼내는목적) 왜? -> 상위타입의 타입파라미터니까
		
		//값이 들어올 때(in) extends
		MyClass02<? extends String> o3 = new MyClass02<String>();
//		o2.item = new String(); //String 또는 그 하위타입을 대입 불가능
		String s2 = o3.item; // String에 할당 가능
		Object s3 = o3.item; // String에 할당 가능
		//프로그램기준으로 값이 들어오는 거니까 in에 해당
	}

}

class MyClass02<T> {
	public T item;
}

package ch13.lecture.p02wildcard;

public class C03WildCard {
	public static void main(String[] args) {
		MyClass03<? super Number> o1  = new MyClass03<Number>();
		MyClass03<? super Number> o2 = new MyClass03<Object>();
		o1.item = new Number(); //됨 (추상 클래스여서 인스터스화 하지못할뿐)
		o1.item = new Integer(0);//하위타입 가능
		o1.item = new Object(); // 안됨 o1은 Number타입 또는! 그 이상 
		
		MyClass03<? extends Number> o3 = new MyClass03<Number>();
		MyClass03<? extends Number> o4 = new MyClass03<Integer>();//t는 넘버타입또는하위타입
		Number n1 = o4.item; //ok
		Object o6 = o4.item; //ok
		Integer i1 = o4.item //안됨 o4는 인스턴스 타입이 뭔지 모르는 상태에서 앞의 타입으로 자신의 타입을 결정짓기 때문에 안됨 
				              //=> o4는 Number타입. Number는 Integer가 될 수 없음
				
		
	}
}


class MyClass03<T> {//T는 넘버아님 오브젝트
	public T item;
}
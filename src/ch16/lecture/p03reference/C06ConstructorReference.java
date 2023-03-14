package ch16.lecture.p03reference;

public class C06ConstructorReference {
	//생성자 참조
	//Reference to a constructor
	
	public static void main(String[] args) {
		MyInterface07 o1 = () -> {return new MyClass07();};
		MyInterface07 o2 = () -> new MyClass07();//추상메소드파라미터와 인스턴스파라미터가 일치하면
		MyInterface07 o3 = MyClass07::new; //생성자 참조
		
		MyInterface08 o4 = (a) -> new MyClass07(a);//파라미터 값으로 단순히 생성자의 인스턴스를 만들어낼때
		MyInterface08 o5 = MyClass07::new;
	}

}

interface MyInterface08 {
	MyClass07 cation(int a);
}

interface MyInterface07 {
	MyClass07 action();//MyClass07타입을 리턴함
}


class MyClass07 {
	MyClass07() { //파라미터 없는 생성자
		
	}
	MyClass07(int a) { //파라미터 있는 생성자
		
	}
	
}

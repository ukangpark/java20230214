package ch16.lecture.p02lambda;

public class C05Lambda {
	public static void main(String[] args) {
		MyInterface05 o1 = new MyClass05();
		int r1 = o1.method();
		
		MyInterface05 o2 = () -> {
			System.out.println("람다식 메소드 재정의");
			return 80;
		};
		o2.method();
		
		MyInterface05 o3 = () -> {
			return 5;//명령문을 작성을 해야하는데 하나있는 명령문일땐 어차피 만나야할 명령문은 리턴이기 때문에 리턴이 적힘
		};
		o3.method();
		
		MyInterface05 o4 = () -> 5;//어차피 한줄로 나타날 명령문은 리턴이기 때문에 return을 생략가능
		o4.method();
	}

}

class MyClass05 implements MyInterface05 {
	@Override
	public int method() {
		System.out.println("명령문 작성..");
		
		return 99;
	}
}

interface MyInterface05 {
	//리턴타입이있는 메소드
	int method();
}

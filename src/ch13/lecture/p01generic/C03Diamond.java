package ch13.lecture.p01generic;

public class C03Diamond {
	public static void main(String[] args) {
		MyClass03<String> o1 = new MyClass03<String>();
		
		//인스턴스 만드는 타입의 아규먼트 생략 가능
		//참조변수때문에 뒤에 타입이 유추가 되니까
		//<> 다이아몬드 표기법
		MyClass03<String> o2 = new MyClass03<>();
	}

}

class MyClass03<T> {
	public T item;
}

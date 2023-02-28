package ch06.lecture.p04static;

public class C02Static {
	public static void main(String[] args) {
		//인스턴스 생성 없이 바로 사용가능
		MyClass02.name = "son";
		MyClass02.age = 55;
		
		MyClass02.greeting();
	}

}

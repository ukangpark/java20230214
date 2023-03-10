package ch09.lecture.p01nested;

public class C03StaticNestedClass {
	public static void main(String[] args) {
		MyClass03.Nested03 o1 = new MyClass03.Nested03();
		//밑에서 쓸꺼면 변수에 담기
		//인스턴스 생성없이 static이기 때문에 클래스명으로 바로 접근가능
		}

}

class MyClass03 {
	//static nested class 정적 멤버 클래스
	static class  Nested03 {
		
	}
}

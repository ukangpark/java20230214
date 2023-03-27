package ch12.lecture.p06annotation;

public class C01Annotation {
	public static void main(String[] args) {
		
	}

}
@MyAnnotation01
class MyClass {
	@MyAnnotation01
	String field;
	
	@MyAnnotation01
	MyClass() {
		
	}
	
	@MyAnnotation01
	void method01() {
		
		@MyAnnotation01
		int var;
	}
	
	void method02(@MyAnnotation01 int param) {
		
	}
}
//어디든 붙여놓으면 리플렉션에서 있는가없는가에 따라서 컴파일러나 다른프로그램이나 프래임워크에서 활용함
@interface MyAnnotation01{
	
}
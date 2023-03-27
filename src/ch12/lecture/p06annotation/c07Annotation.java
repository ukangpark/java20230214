package ch12.lecture.p06annotation;

public class c07Annotation {

}

class MyClass07 {
	@MyAnnotation07(value = "hello")
	String field1;
	@MyAnnotation07("greeting")
	String field2;
	@MyAnnotation07("value 생략가능")
	String field3;
}

@interface MyAnnotation07 {
	//특별한 속성이 있다. value
	//어노테이션에서 속성에 값을 줄때 value가 생략될수있음
	String value();
}
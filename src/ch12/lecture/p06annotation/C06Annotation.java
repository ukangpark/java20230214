package ch12.lecture.p06annotation;

public class C06Annotation {
	

}
class MyClass06 {
	@MyAnnotation06//속성의 값을 안주면 0
	String field1;
	@MyAnnotation06(myAttr = 1) //속성값을 주면 주는 결과가 리턴
	int field2;
	@MyAnnotation06
	boolean field3;
}


@interface MyAnnotation06 {
	int myAttr() default 0;//기본값을 설정해줬을 때
}

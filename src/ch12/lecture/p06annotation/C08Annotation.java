package ch12.lecture.p06annotation;

public class C08Annotation {

}

class MyClass08 {
	@MyAnnotation08 //기본값이 설정되어있어서 속성에 값 안줘도 됨
	int f1;
	@MyAnnotation08(100)//value의 값 => value가 생략된것
	int f2;
	@MyAnnotation08(value = 100)
	int f3;
	@MyAnnotation08(value = 100, name = "lee") //여러개의 속성에 값을 줄때는 value생략 불가
	int f4;
}

@interface MyAnnotation08 {
	int value() default 0;
	String name() default "kim";
	int age() default 0;
}

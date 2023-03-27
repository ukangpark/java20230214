package ch12.lecture.p06annotation;

public class C09Annotaion {

}

class MyClass09 {
	//배열 속성에 값을 줄때 {}안에 작성
	@MyAnnotation09(val1 = "hi", val2 = {"a","b"})
	int fl;
	@MyAnnotation09(val1 = "hi", val2 = {"a"})
	int f2;
	//배열의 값이 1개 일때 중괄호 생략가능
	@MyAnnotation09(val1 = "hi", val2 = "a")
	int f3;
}

@interface MyAnnotation09 {
	String val1();
	//배열형식의 속성값
	String[] val2();
}

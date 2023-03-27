package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C03Annotation {
	public static void main(String[] args) {
		
	}
	

}


//@MyAnnotation03
class MyClass03 {
	
//	@MyAnnotation03
	String field;
	
//	@MyAnnotation03
	MyClass03() {
		
	}
	
	@MyAnnotation03
	void method1() {
		
	}
	
}

//어노테이션 붙이는 위치를 제한하기
//어노테이션만들때 Target생성
@Target (ElementType.METHOD)//원하는 위치 지정해주면됨
//@Target (ElementType.FIELD)//원하는 위치 지정해주면됨
@Retention (RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {
	
}

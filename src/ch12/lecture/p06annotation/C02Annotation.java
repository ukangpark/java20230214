package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C02Annotation {
	public static void main(String[] args) {
		Class c1 = MyClass02.class;
		//어노테이션이 붙어있는 것들의 정보를 알수있음
		Annotation[] annotations = c1.getAnnotations();
		System.out.println(annotations.length);//왜 0이라고 나올까 -> retention을 붙이면 어노테이션이 나옴
	}
}

@MyAnnotation02
class MyClass02 {
	
}

@Retention (RetentionPolicy.RUNTIME)//실행할때까지 어노테이션이 붙어있도록 명시해줘야함
@interface MyAnnotation02 {
	
}

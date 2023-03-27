package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C04Annotation {
	public static void main(String[] args) {
		
	Class c1 = MyClass04.class;
	Annotation[] annotations = c1.getAnnotations();
	System.out.println(annotations.length);
	System.out.println(annotations[0]);
	
	System.out.println(c1.getDeclaredFields()[0].getAnnotations()[0]);
	System.out.println(c1.getDeclaredConstructors()[0].getAnnotations()[0]);
	}
	

}
@MyAnnotation04
class MyClass04 {
	
	@MyAnnotation04
	String field;
}

//여러개를 지정할때
//배열로 만들어서 콤마로 나열 { , ,}
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention (RetentionPolicy.RUNTIME)
@interface MyAnnotation04 {
	
}

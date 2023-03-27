package ch12.lecture.p05reflection;

import java.lang.reflect.*;

public class C02Reflection {
	public static void main(String[] args) {
		Class class1 = String.class;

		// 이름을 알고싶다(full name)
		System.out.println(class1.getName());

		// 이름만 알고싶다(simple)
		System.out.println(class1.getSimpleName());

		// 패키지를 알고싶다.
		System.out.println(class1.getPackageName());

		// 생성자가 뭐가있나
		Constructor[] constructors = class1.getConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor);			
		}

		// 필드
		Field[] fields = class1.getFields();

		// 메소드
		Method[] methods = class1.getMethods();

	}

}

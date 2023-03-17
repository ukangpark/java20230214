package ch17.lecture.p02terminal;

import java.util.*;

public class C05Find {
	public static void main(String[] args) {
		//findFirst
		//findAny (아무거나 발견되기만 하면 true(보통첫번째꺼가 나오긴하지만 아닐수도있음)
		
		//optional (<T>타입을 리턴하는게 아니라 optional타입을 리턴함)있을수도있고없을수도있고라는 의미,제네릭타입임(즉 <T>의 타입이 있을수도있고 없을수도있고)
		
		//Optional<T>
		Optional<String> o1 = Optional.of("java");//java라는 String을 품고있는 optional
		System.out.println(o1.isPresent()); // true
		System.out.println(o1.isEmpty()); // true
		String s1 = o1.get();
		System.out.println(s1);//"java"
		String s2 = o1.orElse("default");
		System.out.println(s2);//"java"
		String s3 = o1.orElse(null);
		
		Optional<String> o2 = Optional.ofNullable(null);
		System.out.println(o2.isPresent());//false
		System.out.println(o2.isEmpty());//true
//		String s3 = o2.get();//안됨
		System.out.println(s3);
		
	}

}

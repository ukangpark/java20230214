package ch15.lecture.p03set;

import java.util.*;

public class C04Contains {
	public static void main(String[] args) {
		//중복이 안된다면, 중복된것이 있는지를 어떻게 알까
		Set<String> set = Set.of("java", "css", "html", "jsp");
		
		//Contains : 해당 원소가 이미 있는지? (boolean 타입)
		System.out.println(set.contains("java")); //true
		System.out.println(set.contains("jsp")); //true
		System.out.println(set.contains("python")); //false
		System.out.println(set.contains(new String("java")));//서로다른객체지만 가지고 있는 값은 같음 -> true 
		
	}

}

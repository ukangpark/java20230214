package ch17.exercise.exam05;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lamda Expressions",
				"Java8 supports lamda expressions");

		System.out.println("for문 사용====================");
		for (String s : list) {
			if (s.toLowerCase().contains("java")) {
				System.out.println(s);
			}
		}
		System.out.println();

		System.out.println("Stream 사용====================");
		list.stream()
				.filter(s -> s.toLowerCase().contains("java"))
				.forEach(System.out::println);
		System.out.println();
		
		System.out.println("Stream 사용2====================");
		list.stream()
				.filter(Example::havingJava)
				.forEach(System.out::println);
	}

	private static boolean havingJava(String s) {
		return s.toLowerCase().contains("java");
	}

}

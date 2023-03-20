package ch17.exercise.exam07;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("hong", "programmer"),
				new Member("kim", "designer"),
				new Member("shin", "programmer")
				);
		
		for (Member s : list) {
			if (s.getJob().equals("programmer")) {
				System.out.println(s.getName());
			}
		}
		
		list.stream()
				.filter(m -> m.getJob().equals("programmer"))
				.map(Member::getName)
				.forEach(System.out::println);
		
		List<Member>dev = list.stream()
				.filter(m -> m.getJob().equals("programmer"))
				.collect(Collectors.toList());
				
				
		dev
				.stream()
				.forEach(s -> System.out.println(s.getName()));
				
	}

}

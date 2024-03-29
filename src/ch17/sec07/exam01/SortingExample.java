package ch17.sec07.exam01;

import java.util.*;

public class SortingExample {
	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("hong", 30));
		studentList.add(new Student("shin", 10));
		studentList.add(new Student("yu", 20));
		
		//점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
			
		//점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}

}

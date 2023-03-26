package ch17.exercise.exam06;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("hong", 30),
				new Member("shin", 40),
				new Member("gam", 26)
				);
		//평균나이 구하기
		System.out.println("for문 사용=========");
		int sum = 0;
		int count = 0;
		for(Member m : list) {
			sum += m.getAge();
			count++;
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (double)sum/count);
		System.out.println();
		
		System.out.println("Stream 사용=========");
		double avg = list.stream()
				.mapToDouble(Member::getAge)
				.average()
				.getAsDouble();
		System.out.println("평균: " + avg);
		
	}

}

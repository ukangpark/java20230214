package ch15.excercise.exam0508;

import java.util.*;

public class Exam0508 {
	public static void main(String[] args) {
		List<List<Integer>>list = List.of(
				List.of(95,86),
				List.of(83,92,96),
				List.of(78,83,93,87,88));
		//문제 6
		System.out.println(list.size());//3
		System.out.println(list.get(2).size());//5
		
		//문제 8
		//합과 평균 구하기
		int sum = 0;
		int count = 0;
		
		for(List<Integer>e : list) {
			for(Integer a : e) {
				sum += a;
				count++;
			}
		}
		System.out.println("합: " + sum);
		System.out.println("평균: " + (double)sum/count);
	}

}

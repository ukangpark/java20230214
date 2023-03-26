package ch17.sec06.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		
	//List 컬렉션 생성
	List<Student> studentList = new ArrayList<>();
	studentList.add(new Student("hong", 85));
	studentList.add(new Student("hong", 92));
	studentList.add(new Student("hong", 87));
	
	//Student를 score 스트림으로 변환
	studentList.stream()
//	.mapToInt(s -> s.getScore())
	.mapToInt(Student::getScore)
	.forEach(System.out::println);
	System.out.println();
	
	System.out.println("max============");
	int list2 = studentList.stream()
			.mapToInt(Student::getScore)
			.max()
			.getAsInt();
	System.out.println(list2);
	System.out.println();
	
	System.out.println("min============");
	int list3 = studentList.stream()
			.mapToInt(Student::getScore)
			.min()
			.getAsInt();
	System.out.println(list3);
	System.out.println();
	
	System.out.println("sum============");
	int list4 = studentList.stream()
			.mapToInt(Student::getScore)
			.sum();
	System.out.println(list4);
	System.out.println();
	
	System.out.println("avg==========");
	double list = studentList.stream()
			.mapToDouble(Student::getScore)
			.average()
			.getAsDouble();
	System.out.println(list);
	System.out.println();
	
	//통계
	System.out.println("통계=========");
	IntSummaryStatistics summary = studentList.stream()
	.mapToInt(Student::getScore)
	.summaryStatistics();
	System.out.println("최대: " + summary.getMax());
	System.out.println("최소: " + summary.getMin());
	System.out.println("합계: " + summary.getSum());
	System.out.println("평균: " + summary.getAverage());

	}
}

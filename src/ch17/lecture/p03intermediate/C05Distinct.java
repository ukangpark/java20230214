package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C05Distinct {
	public static void main(String[] args) {
		//로또 번호 뽑기
		//1~45 중 6개를 랜덤으로 뽑기
//		Stream<Integer> stream = Stream.<Integer>generate(() -> 3);//3을 계속 생성해내는 메소드를 파라미터로 받음
		Stream<Integer> stream = Stream.<Integer>generate(() -> (int) (Math.random() * 45)+1);//무한히 뽑힘
		
		stream
		.distinct() // 중복을 제거
		.limit(6) // 6개로 원소제한
		.forEach(System.out::println); //forEach를 만나고 위의 중간연산메소드들이 한꺼번에 실행됨
		
		//Random class 사용해서 로또 번호 뽑기를 만들어보자
		Random random = new Random();
		
		Stream.generate(()-> random.nextInt(45)+1)
			.distinct()
			.limit(6)
			.forEach(System.out::println);
	}

}

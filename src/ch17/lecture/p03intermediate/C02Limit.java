package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C02Limit {
	public static void main(String[] args) {
		//limit 중간 연산 : 크기를 제한함
		
		List<String> list = List.of("java", "css", "html","spring", "jsp");
		
		Stream<String> stream1 = list.stream();//string을 가지고 있는 stream
		Stream<String> stream2 = stream1.limit(3);//스트림 원소 중 3개로 제한
		long count = stream2.count();//count메소드를 만나면서 위의 코드가 한꺼번에 실행됨
		System.out.println(count); //3
		
		//메소드 chaining
		long count2 = list.stream()
			.limit(3) // 중간연산
			.count(); // 최종연산
		
		System.out.println(count2); //3
	}

}

package ch15.excercise.exam0507;

import java.util.*;

public class Exam0507 {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,5,3,8,2);
//		list.add(1);
//		list.add(5);
//		list.add(3);//List를 만들때 바로 원소들을 넣고싶다. => list.of(1,2,3,,,);
					//list.of는 변경불가 => of : 수정 불가 리스트 리턴
					//.add는 변경가능
		//위 리스트에서 최대값 구하는 코드 작성
		int result = Integer.MIN_VALUE;
		for(int a : list) {
			result = Math.max(result, a);
		}
	}

}

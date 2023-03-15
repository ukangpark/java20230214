package ch15.lecture.p02collections;

import java.util.*;

public class C01Collections {
	
	public static void main(String[] args) {
		//수정불가 리스트
		List<String> list1 = List.of("java", "css", "spring", "jsp", "html");
		//수정가능 리스트로 다시 만듦
		List<String> list2 = new ArrayList<>(list1);//파라미터에 넣어주면 수정가능하게 만들어짐
		
		//sort메소드 정렬하기
		Collections.sort(list2);
		System.out.println(list2);
		
		//max메소드 최대값구하기
		String maxStr = Collections.max(list1);//extends여서 in
		System.out.println(maxStr);
		
		//min메소드 최소값구하기
		String minStr = Collections.min(list1);//extends여서 in
		System.out.println(minStr);
		
		//reverse메소드 반대순서로 바꿔주기
		Collections.reverse(list2);
		System.out.println(list2);
		
		//fill메소드 list의 원소들을 특정값으로 전부 바꿔주기
		Collections.fill(list2, "web");
		System.out.println(list2);
		
		
	}

}

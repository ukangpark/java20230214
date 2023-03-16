package ch15.sec08;

import java.util.*;

public class ImmutableExample {
	public static void main(String[] args) {
		//List 불변 컬렉션 생성
		List<String> immutableList1 = List.of("A","B","C");
		//immutableList1.add("D");//수정불가하여 안됨
		
		//Set 불변 컬렉션 생성
		Set<String> immutableSet1 = Set.of("A","B","C");
		//immutableList1.remove("A") //수정불가하여 안됨
		
		//Map 불변 컬렉션 생성
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A",
				2, "B",
				3, "C"
				);
		//immutableMap1.put(4, "D"); // 수정불가하여 안됨
		
		//List 컬렉션을 불변 컬렉션으로 복사
		List<String>list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		
		//수정가능한 리스트로 만들기
		List<String> list2 = new ArrayList<>(immutableList2);
		list2.add("D"); // <- 가능해짐
		
		//Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		
		//수정가능한 Set으로 만들기
		Set<String> set2 = new HashSet<>(immutableSet2);
		set2.add("E"); //<- 가능해짐
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(1, "B");
		map.put(1, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		
		//수정가능한 Map으로 만들기
		Map<Integer, String> map2 = new HashMap<>(immutableMap2);
		map.put(4, "D"); //<-가능해짐
		
		//배열로부터 List 길이불변 컬렉션 생성
		String[] arr = {"A","B","C"};
		List<String> immutableList3 = Arrays.asList(arr);
		//요소수정은 가능. API : 크기가 고정된 배열을 리스트로 가지는것
		
		Integer[] arr2 = {3,4,5}; //Int[] 안됨
		List<Integer> list4 = Arrays.asList(arr2);//int타입의 배열은 Integer타입으로 자동박싱되지않음
													// Integer타입의 리스트를만들고 싶으면 배열의 타입도 Integer로 맞춰줘야함
				
	}

}

package ch15.lecture.p04map;

import java.util.*;

public class C01Map {
	public static void main(String[] args) {
		//map
		//(key, value) 쌍 entry를 저장
		//key는 중복되지 않음
		
		Map<String, String> map = new HashMap<>();
		
		//put메소드(key값, value값) entry 추가
		map.put("kang", "slamdunk");
		map.put("serly", "avatar");
		map.put("maverick", "topgun");
		
		//size메소드 entry의 수
		int size = map.size();
		System.out.println(size);//3
		
		map.put("kang", "baseball");
		System.out.println(size);//3 key 중복불가 그럼 저장은 slamdunk? baseball? => 마지막에 들어간 value로 대체됨
		
		//get메소드(key값) key로 value 얻기
		String v1 = map.get("serly");
		System.out.println(v1);//avarta
		System.out.println(map.get("kang"));//baseball
		
		//remove메소드(key값) entry지우기
		map.remove("kang");
		System.out.println(map.size());//2
		
		//전체탐색(key가 필요함 중복되지 않으니까 set의 특징과 같음)
		
		//keySet메소드 사용
		System.out.println("keySet 사용====================");
		Set<String> keys = map.keySet(); //키 set 얻기
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		//forEach메소드 사용
		System.out.println("forEach 사용====================");
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		//entrySet메소드 각entry들을 set으로 가지고 있음
		System.out.println("entrySet 사용====================");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
	}

}

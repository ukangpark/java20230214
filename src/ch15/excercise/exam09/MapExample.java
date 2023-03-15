package ch15.excercise.exam09;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keys = map.keySet();
		for (String e : keys) {
			System.out.println(e);
				
		}
	}

}

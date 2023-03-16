package ch15.excercise.leetcode;

import java.util.*;

public class Solution2206 {
	public boolean divideArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		//각 값이 몇개인지 세는 코드
		for (int n : nums) {
			if (map.containsKey(n)) {				
			//키 n의 값(value)을 1 더해서 다시 entry에 넣는다.
			int oldvalue = map.get(n);//get메소드는 Map의 메소드(map은 타입이 Map타입이니까) 
			// get(n): n(key)의 value값을 뽑아내라. n이 3이면, 3이 key가 되고 value는 없으니까 0으로 시작하는것!
			map.put(n, oldvalue + 1);
			}else {
				//없을때는(새로운키) value에 1을 넣어주기
				map.put(n, 1);
			}
		}
		//value가 짝수면 true
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int v = entry.getValue();//getValue메소드는 Entry의 메소드 (entry는 타입이 Entry타입이니까)
			if (v % 2 == 1) {
				return false;
			}
		}
		return true;
	}
}

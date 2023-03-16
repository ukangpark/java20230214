package ch15.excercise.leetcode;

import java.util.*;

public class Solution1748 {
	public int sumOfUnique(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		//각 값이 몇개인지 세는 코드
		for (int n : nums) {
			if (map.containsKey(n)) {
				// 키 n의 값에 1을 더해서 다시 entry에 넣기
				// 중복된 키가 있으면 1을 더함
				int oldvalue = map.get(n);
				map.put(n, oldvalue + 1);
			} else {
				// 새로운키를 만나면 value에 0을 넣기
				map.put(n, 0);
			}
//			map.putIfAbsent(n, 0);//for문을 돌리다가 key가 없으면(새롭게 만나면) value를 넣어라(putIfAbsent메소드)
//			map.replace(n, oldvalue + 1)//for문을 돌리다가 key가 있으면(중복된것을 만나면) value를 넣어라(대체해라)(replace메소드)
		}
		//value가 1인 key값이면 그값들을 더함
		int sum = 0;
		int k = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int v = entry.getValue();
			if (v == 0) {
				k = entry.getKey();
				sum += k;
			}
		}
		return sum;
	}
}

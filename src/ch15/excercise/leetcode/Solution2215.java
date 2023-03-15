package ch15.excercise.leetcode;

import java.util.*;

public class Solution2215 {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		// 코드 작성
		Set<Integer> set1 = new HashSet<>();
		for(int i=0; i<nums1.length; i++) {
			set1.add(nums1[i]);
		}
		Set<Integer> set2 = new HashSet<>();
		for (int j=0; j<nums2.length; j++) {
			set2.add(nums2[j]);
		}
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.addAll(set1);
		list2.addAll(set2);
		
		list1.removeIf(set2::contains);
		list2.removeIf(set1::contains);

		return List.of(list1, list2);
	}

}

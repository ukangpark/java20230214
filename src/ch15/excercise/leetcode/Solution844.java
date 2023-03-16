package ch15.excercise.leetcode;

import java.util.*;

public class Solution844 {
	public boolean backspaceCompare(String s, String t) {
		// Stack 컬렉션 생성
		Stack<String> str1 = new Stack<>();
		str1.push(s);
		Stack<String> s1 = str1;
		Stack<String> str2 = new Stack<>();
		str2.push(t);
		Stack<String> s2 = str2;

		// str1, str2에 각각 s,t의 값을 1개씩 넣는데(push), #을 만나면 빼기(pop)

		// str1
		while (s1.size() > 0) {
			if (s1.equals("#")) {
				if (!s1.isEmpty()) {
					s1.pop();
				}
			}
			s1.push(s);
		}
		// str2
		while (s2.size() > 0) {
			if (s2.equals("#")) {
				if (!s2.isEmpty()) {
					s2.pop();
				}
			}
			s2.push(t);
		}
		// str1과 str2가 같으면 true / 다르면 false
		if (s1.equals(s2)) {
			return true;
		}
		return false;
	}

}

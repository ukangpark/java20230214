package ch15.lecture.p07treeSet;

import java.util.*;

public class C01TreeSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(); //그냥 set은 순서가 보장되지 않음
		Set<Integer> treeSet = new TreeSet<>();//treeSet은 순서가 보장됨 -> 트리구조로 정렬되어서 나타남
		
		set.add(3000);
		treeSet.add(3000);
		set.add(20);
		treeSet.add(20);
		set.add(2000);
		treeSet.add(2000);
		
		set.add(20);//중복저장불가
		treeSet.add(20);//중복저장불가
		
		System.out.println(set);
		System.out.println(treeSet);
	}

}

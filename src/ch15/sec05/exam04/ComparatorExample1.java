package ch15.sec05.exam04;

import java.util.*;

public class ComparatorExample1 {
	public static void main(String[] args) {
		TreeSet<Fruit1> treeSet = new TreeSet<>((x,y)->x.getPrice() - y.getPrice());
		
		treeSet.add(new Fruit1("포도",3000));
		treeSet.add(new Fruit1("수박",10000));
		treeSet.add(new Fruit1("딸기",6000));
		
		System.out.println(treeSet);
		//큰 순서대로
		NavigableSet<Fruit1> t1 = treeSet.descendingSet();
		System.out.println(t1);
		
	}

}

package ch15.sec05.exam03;

import java.util.*;

public class ComparableExample {
	public static void main(String[] args) {
		//TreeSet 컬렉션 생성
		TreeSet<Person> treeSet = new TreeSet<Person>();//comparable를 구현했기 때문에 comparator를 가지고올필요가없음
		
		//객체 저장
		treeSet.add(new Person("hong",30));
		treeSet.add(new Person("gam",25));
		treeSet.add(new Person("park",39));
		
		//객체 하나씩 가져오기
		for (Person person : treeSet) {
			System.out.println(person.name + ": " + person.age);
		}
	}

}

package ch15.lecture.p02collections;

import java.util.*;

public class C04Compare {
	public static void main(String[] args) {
		var list = new ArrayList<Person04>();
		list.add(new Person04("kang", "20230315"));
		list.add(new Person04("seo", "20221203"));
		list.add(new Person04("chae", "20020605"));
		list.add(new Person04("song", "20121203"));
		list.add(new Person04("jung", "20210707"));
		
		//나이순 정렬(나이가 어릴수록 작은 index에)
		List<Person04> o1 = new ArrayList<>(list);
		Collections.sort(o1);
		Collections.reverse(o1);
		System.out.println(o1);
//		Collections.sort(list, (a, b) -> b.getBirth().compareTo(a.getBirth()));
		//b,a를 바꿔서 반대로 나오게
	}
	

}

class Person04 implements Comparable<Person04> {
	private String name;
	private String birth;
	
	//생성자
	public Person04(String name, String birth) {
		super();
		this.name = name;
		this.birth = birth;
	}
	
	//toString
	@Override
	public String toString() {
		return "Person04 [name=" + name + ", birth=" + birth + "]";
	}
	
	@Override
	public int compareTo(Person04 o) {
		return this.birth.compareTo(o.birth);
	}

	//get,set 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
}

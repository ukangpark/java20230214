package ch15.lecture.p02collections;

import java.util.*;

public class C03Compare {
	public static void main(String[] args) {
		List<Person03> list = new ArrayList<>();
		list.add(new Person03("cha", 50));
		list.add(new Person03("son", 30));
		list.add(new Person03("park", 60));
		list.add(new Person03("kim", 60));//같으면 이름순으로
		
		System.out.println(list);//내가 넣은대로 들어가있음
		
		//Collections사용가능!!
		
		Collections.sort(list);
		System.out.println(list);
	}

}

class Person03 implements Comparable<Person03>{
	private String name;
	private int age;
	
	//생성자
	public Person03(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//toString
	@Override
	public String toString() {
		return "Person03 [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Person03 o) {
		
//		return this.age - o.age;
		
//		return this.name.compareTo(o.name);
		
		//먼저나이순으로하고 나이가같다면 이름순으로 하겠다(비교를 어떻게할것인지 내가 정할수있음-내가만든클래스니까)
		int ageDiff = this.age - o.age;
		
		if(ageDiff == 0) {
			return this.name.compareTo(o.name);
		}
		
		return ageDiff;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

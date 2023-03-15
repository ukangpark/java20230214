package ch15.lecture.p02collections;

import java.util.*;

public class C02Compare {
	public static void main(String[] args) {
		List<Person02> list1 = List.of(
				new Person02("son",30),
				new Person02("cha",40),
				new Person02("park",20));
		List<Person02> list2 = new ArrayList<>(list1);
		
		//Comparator.compare
		//compare는 람다식으로 사용가능
		//다음 세개중 하나의 값 리턴함
		//음수 : 첫번째 매개값이 작으면
		//0 : 두값이 같으면
		//양수 : 첫번째 매개값이 크면
		//나이를 기준으로 값을 뽑고싶다. => 두수를 기준으로 빼면 음,0,양이 나옴 -> 이걸이용해서 최대값 최소값 정렬등을 뽑을수있음
//		Collections.max(list2);//comparable을 extends하지 않아서 사용하지 못함
		Person02 maxAge = Collections.max(list2, (Person02 a,Person02 b) -> a.getAge() - b.getAge() );
		System.out.println(maxAge.getName() + ", " + maxAge.getAge());
		
		Person02 minAge = Collections.min( list2, (a,b) -> a.getAge() - b.getAge() );
		System.out.println(minAge);
		
		//위의 람다식을 풀어서 써본다면 아래와 같음 
		//즉, compare 메소드를 재정의 해준것
//		Comparator o1 = new Comparator() {
//		@Override
//		public int compare(Person02 a, Person02 b) {
//			return a.getAge() - b.getAge();	
//		};
//		}
		
		
		System.out.println(list2);
		Collections.sort( list2, (x, y) -> x.getAge() - y.getAge() );
		System.out.println(list2);
		
		//나이순 정렬
		Collections.sort(list2, (x, y) -> x.getAge() - y.getAge());
		System.out.println(list2);
		
		//이름순 정렬
		//comparable.compareTo
		//String값을 비교함
		
//		Collections.sort(list2, (x, y) -> x.getName() - y.getName());//안됨. Comparator는 String으로 구현될 수 없음
		Collections.sort(list2, (x, y) -> x.getName().compareTo(y.getName()));
		System.out.println(list2);
		
		
	}
	
	

}

@FunctionalInterface
interface Comparator {
	 int compare(Person02 a, Person02 b);
}

//차라리 네츄럴오더링이 가능하게 만든다면?
class Person02 {
	private String name;
	private int age;
	
	public Person02(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Person02 [name=" + name + ", age=" + age + "]";
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

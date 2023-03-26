package ch17.lecture.p03intermediate;

import java.util.*;

public class C18Sorted {
	public static void main(String[] args) {
		List<Car> list = List.of(
				new Car("venue", 50000),
				new Car("genesis", 100000),
				new Car("avante", 5000),
				new Car("moring", 100)
				);
		list.stream()
			.sorted()
			.forEach(System.out::println);
		System.out.println();
		
		//재정의한 메소드가 맘에 안듦
		//이름순으로 하고 싶다! comparator로 재정의
		list.stream()
			.sorted((a,b)->a.getName().compareTo(b.getName()))
			.forEach(System.out::println);
		System.out.println();
		
		//가격을 역순으로 나오게 하고 싶다! (a,b 거꾸로 빼주기)
		list.stream()
			.sorted((a,b) -> b.getPrice()-a.getPrice())
			.forEach(System.out::println);
		System.out.println();
		
		//내추럴오더링 역순을 나오게 하는 일이 자주 발생. comparator.reverseOrder메소드 사용
		list.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
		
	}

}

class Car implements Comparable<Car> {
	private String name;
	private int price;
	
	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Car o) {
		return this.price - o.price;
	}
	
	
}

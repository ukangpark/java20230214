package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C17Collect {
	public static void main(String[] args) {
		//종류별로 묶기(middle, heavy, light)
		List<Car> list = List.of(
				new Car("avante", "middle",100000),
				new Car("genesis", "heavy",5800000),
				new Car("casper", "light",12000),
				new Car("moring", "light",40000),
				new Car("sonata", "heavy",69500),
				new Car("k5", "middle",480000));
		
		Map<String, List<Car>> r1 = list.stream()
				.collect(Collectors.groupingBy(Car::getType));
		
		for (var entry : r1.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		Map<String, Integer> r2 = list.stream()
				.collect(Collectors.groupingBy(Car::getType,
						Collectors.summingInt(Car::getPrice)));
		
		System.out.println(r2);
	}
	

}

class Car {
	private String name;
	private String type;
	private int price;
	
	public Car(String name, String type, int price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	
}

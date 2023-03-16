package ch15.sec05.exam04;

import java.util.*;

public class Fruit1 {
	private String name;
	private int price;
	
	//생성자
	public Fruit1(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	//get/set 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//toString 재정의
	@Override
	public String toString() {
		return "Fruit1 [name=" + name + ", price=" + price + "]";
	}

	//hashcode, equals 재정의
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit1 other = (Fruit1) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
	
	
	
}

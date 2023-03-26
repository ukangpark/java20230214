package ch17.lecture.p03intermediate;

import java.util.*;

public class C11Map {
	public static void main(String[] args) {
		List<Book> list = List.of(
				new Book("slamdunk", 3000),
				new Book("avatar", 4000),
				new Book("the glory", 5000),
				new Book("avengers", 2000)
				);
		
		int sum = list.stream()
//		.map(Book -> Book.getPrice())
		.map(Book::getPrice)
		.reduce(Integer::sum)
		.get();
		
		System.out.println(sum);
		
		
		double avg = list.stream()
				//stream을 IntStream으로 바꾸겠다 average메소드를 사용하고 싶어서( mapToInt메소드) int타입을 리턴
				.mapToInt(Book::getPrice)
				.average()
				.getAsDouble();
		
		System.out.println(avg);
	}

}

class Book {
	private String title;
	private int price;
	
	//생성자
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	//get, set 메소드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

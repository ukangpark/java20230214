package ch17.lecture.p03intermediate;

import java.util.*;

public class C17Sorted {
	public static void main(String[] args) {
		List<Movie> movie = List.of(
				new Movie ("avatar", 10000),
				new Movie ("slamdunk", 9000),
				new Movie ("avengers", 7000),
				new Movie ("herrypoter", 15000)
				);
		
		movie.stream()
//			.sorted()//comparable을 구현하지 않아 exception발생 
			.sorted((a,b)->a.getPrice() - b.getPrice())//comparable을 구현하지 않은 스트림을 정렬하려면 comparator를 받아야함
			.forEach(System.out::println);
			System.out.println();
		
		System.out.println("title 정렬======================");
		movie.stream()
			.sorted((a,b)-> a.getTitle().compareTo(b.getTitle()))
			.forEach(System.out::println);
				
		
	}

}

class Movie {
	private String title;
	private int price;
	
	public Movie(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", price=" + price + "]";
	}

	
}

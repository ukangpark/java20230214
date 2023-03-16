package ch15.lecture.p07treeSet;

import java.util.*;

public class C03Comparator {
	//우리가 만든 클래스는 naturalOrdering이 아니기 때문에 comparable이아닌 Comparator를 가지고와야함
	public static void main(String[] args) {
		TreeSet<Book> set = new TreeSet<>((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
		set.add(new Book("slamdunk"));
		set.add(new Book("avatar"));
		set.add(new Book("glory"));
		//TreeSet class 메소드 중에 comparator를 제공해주는 메소드를 가지고 와야함
		
		System.out.println(set);//TreeSet이기 때문에 알파벳순으로 정렬되어 출력됨
	}
}

class Book {
	private String title;
	
	public Book(String title) {
		super();
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}

	
	
}

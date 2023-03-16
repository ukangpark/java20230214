package ch15.lecture.p07treeSet;

import java.util.*;

public class C0301Comparator {
	public static void main(String[] args) {
		TreeSet<Book1> set = new TreeSet<>((a,b)-> a.getTitle().compareTo(b.getTitle()));
		set.add(new Book1("slamdunk"));
		set.add(new Book1("avatar"));
		set.add(new Book1("glory"));
		
		System.out.println(set);
	}
}

class Book1 {
	private String title;
	
	public Book1(String title) {
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
		Book1 other = (Book1) obj;
		return Objects.equals(title, other.title);
	}
}
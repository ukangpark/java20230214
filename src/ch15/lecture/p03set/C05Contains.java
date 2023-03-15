package ch15.lecture.p03set;

import java.util.*;

public class C05Contains {
	public static void main(String[] args) {
		//Objects의 equals메소드를 사용하여 true / false를 판별함
		//equals메소드는 모든 클래스가 가질 수 있는 메소드
		var set = new HashSet<Book>();
		set.add(new Book("slamdunk"));
		set.add(new Book("avatar"));
		set.add(new Book("topgun"));
		set.add(new Book("slamdunk"));//안들어감
		
		System.out.println(set.size());//3
		
		System.out.println(set.contains(new Book("avatar")));//false!! 왜? object의 equals를 재정의 한 적이 없음
		//hashcode를 같게 해 주면됨 (equals와 함께) // -> true가 나옴
		
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


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}

package ch13.excersice.exam3;

public class Container<T, U> {
	private T item1;
	private U item2;
	
	public T getKey() {
		return item1;
	}
	public U getValue() {
		return item2;
	}
	
	public void set(T item1, U item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void setBackground(T item1, U item2) {
		this.item1 = item1;
		this.item2 = item2;
		
	}

}

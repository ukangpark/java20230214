package ch12.lecture.p01object;

import java.util.*;

public class C22HashCodeEquals {
	public static void main(String[] args) {
		Object o1 = new MyClass22(1,"kim", "seoul", false);
		Object o2 = new MyClass22(1,"kim", "seoul", false);
		Object o3 = new MyClass22(1,"kim", "seoul", true);
		
		System.out.println(o1.hashCode());//같음
		System.out.println(o2.hashCode());//같음
		System.out.println(o3.hashCode());//다름
		System.out.println(o1.equals(o2));//true
		System.out.println(o1.equals(o3));//false hashcode가 다르니까
		
		//하지만 실제 참조값은 전부 다름
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
		System.out.println(System.identityHashCode(o3));
	}

}

class MyClass22 {
	private int id;
	private String name;
	private String address;
	private boolean married;
	
	public MyClass22(int id, String name, String address, boolean married) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.married = married;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, id, married, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass22 other = (MyClass22) obj;
		return Objects.equals(address, other.address) && id == other.id && married == other.married
				&& Objects.equals(name, other.name);
	}
	
	
	
	
}

package ch12.lecture.p01object;

public class C18Equals {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		System.out.println(o1.hashCode());//o3와 같음(같은인스턴스)
		System.out.println(o2.hashCode());//다름
		System.out.println(o3.hashCode());//o1과 같음(같은인스턴스)
		
		System.out.println(o1.equals(o3));//true
		System.out.println(o1.equals(o2));//false 왜? -> hashcode자체가 다르니까.
		
		System.out.println(o3.equals(o1));//true
		System.out.println(o3.equals(o2));//false
	}

}

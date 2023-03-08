package ch12.sec03.exam04;

public class RecordExample {
	public static void main(String[] args) {
		Member m = new Member("Winter", "눈송이", 25);
		System.out.println(m.id());//getter메소드 호출
		System.out.println(m.name());//getter메소드 호출
		System.out.println(m.age());//getter메소드 호출
		System.out.println(m.toString());//toString 재정의
		System.out.println(m);//toString()생략가능
		System.out.println();
		
		Member m1 = new Member("winter", "눈송이", 25);
		Member m2 = new Member("winter", "눈송이", 25);
		System.out.println(System.identityHashCode(m1));
		System.out.println(System.identityHashCode(m2));
		System.out.println("m1.hashCode(): " + m1.hashCode());
		System.out.println("m2.hashCode(): " + m2.hashCode());
		System.out.println("m1.hashCode(m2): " + m1.equals(m2));
	}

}

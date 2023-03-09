package ch12.lecture.p01object;

public class C17Hashcode {
	public static void main(String[] args) {
		Object o1 = new String("java");
		Object o2 = new String("spring");
		Object o3 = new String("java");
		
		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		int h3 = o3.hashCode();
		
		System.out.println(h1);//o1의 hashCode와 o3의 hashCode는 같음 왜? 같은문자열의 hashcode는 hashcode가 같음
		System.out.println(h2);//다른 해쉬코드
		System.out.println(h3);//o1의 hashCode와 o3의 hashCode는 같음 왜? 같은문자n열의 hashcode는 hashcode가 같음
	}

}


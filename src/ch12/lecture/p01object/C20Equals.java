package ch12.lecture.p01object;

public class C20Equals {
	public static void main(String[] args) {
		Object o1 = new String("java");
		Object o2 = new String("spring");
		Object o3 = new String("java");
		Object o4 = o1;
		
		System.out.println(o1.hashCode());//같음
		System.out.println(o2.hashCode());//다름
		System.out.println(o3.hashCode());//같음(같은 문자열을 가짐 - String 재정의)
		System.out.println(o4.hashCode());//같음(인스턴스가 동일)
		
		System.out.println(o1.equals(o4));//true
		System.out.println(o1.equals(o3));//true 문자열이 같으면 같은 객체로 보겠다.이퀄즈에서 트루면 무조건 이전에 해쉬코드는 같아져있다.
											//이퀄즈가 false여도 hashcode는 true일수있다.
		System.out.println(o1.equals(o2));//false 이전에 해쉬코드도 달랐음
	}

}

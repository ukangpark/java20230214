package ch12.lecture.p05reflection;

public class c01Reflection {
	public static void main(String[] args) throws Exception {
		//reflection
		//클래스에 관한 정보를 코드로 반영한다.
		
		//클래스정보를 가진 객체 생성
		
		//1. 클래스 이름을 통해 얻는방법 / 클래스의 .class 속성으로 얻기
		//클래스라는 클래스1의 인스턴스 스트링클래스에대한 정보가 담김
		Class<String> class1 = String.class;
		
		//2. forName static method로 얻기
		Class<String> class2 = (Class<String>)Class.forName("java.lang.String");
		
		//3. 객체로 부터 얻기 getClass메소드
		String s1 = "java";
		Class<String> class3 = (Class<String>)s1.getClass();
		
		System.out.println(System.identityHashCode(class1));//다 같은 참조값 = 다같은 객체라는 뜻
		System.out.println(System.identityHashCode(class2));//아무거나 쓰면됨
		System.out.println(System.identityHashCode(class3));
		
		//패키지는 뭔지 이름은 뭔지 어떤 인터페이스를 구현했는지 상속은 뭘구현했는지 필드는 뭔지 생성자는 뭘가지고 있는지 등등의 정보를 가지고 있는게 클래스타입의 객체이다.
		
		
	}

}

package ch16.sec05.exam02;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
//		person.ordering((a, b)-> a.compareToIgnoreCase(b));
		//a의 타입과 메소드 명으로 줄일수있음
		person.ordering( String :: compareToIgnoreCase);
		
	}

}

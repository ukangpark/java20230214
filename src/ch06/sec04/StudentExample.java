package ch06.sec04;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 =  new Student();
		System.out.println("s1 변수가 student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		System.out.println(s1 == s2); // false 
		//실제로 참조값이 다른지 확인해 본다면,
		//참조값얻기 : System.identityHashCode();
		System.out.println(System.identityHashCode(s1));//참조하는 주소의 값(=참조값)
		System.out.println(System.identityHashCode(s2));//참조하는 주소의 값(=참조값)
	}

}

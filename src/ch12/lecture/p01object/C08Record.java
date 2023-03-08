package ch12.lecture.p01object;

public class C08Record {

}
//읽기전용 클래스
class MyClass08 {
	//private 필드선언
	private String name;
	private int age;
	
	//참조할수있는(public) getter 메소드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	//setter 메소드는 없어야함 -> 읽기전용클래스이기때문에 값을 변경할수없음
	
	//생성자
	public MyClass08(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//객체에 어떠한 값이 들어있는지 확인용 toString 재정의 메소드
	@Override
	public String toString() {
		return "MyClass08 [name=" + name + ", age=" + age + "]";
	}
	
	// => 가장많이 사용되는 코드인데 계속 쓰기 번거로움 -> 다쓸필요없이 함축적으로 만들수있다. record선언
}

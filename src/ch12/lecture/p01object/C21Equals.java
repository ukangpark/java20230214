package ch12.lecture.p01object;

public class C21Equals {
	public static void main(String[] args) {
		Object o1 = new MyClass21(5);
		Object o2 = new MyClass21(5);
		Object o3 = new MyClass21(6);

		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		
		System.out.println(o1.equals(o2));//false 필드에 있는 값이 같아도 해쉬코드가 다르니까
		//같게 하고싶다 -> 해쉬코드와 이퀄즈 재정의
		System.out.println(o1.equals(o3));//false 필드에 있는 값이 같아도 해쉬코드가 다르니까
		
	}

}
class MyClass21 {
	private int id;
	
	MyClass21 (int id) {
		this.id = id;
	}
	@Override //해쉬코드도 같게 재정의
	public int hashCode() {
		return id;
	}
	
	@Override // equals를 재정의하면 o1와 o2의 이퀄즈 결과는 같아지지만, 해쉬코드가 다르기때문에 잘못 작성된 코드. 해쉬코드 무조건 똑같이 재정의 해줘야함.
	public boolean equals(Object obj) {
		if (obj !=null && obj instanceof MyClass21 o) {
			return this.id == o.id;
		}
		return false;
	}
}

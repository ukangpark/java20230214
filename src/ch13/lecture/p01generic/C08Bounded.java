package ch13.lecture.p01generic;

public class C08Bounded {
	public static void main(String[] args) {
		MyClass08<Integer> o1 = new MyClass08<>(99);
		o1.handleItem();
		
		MyClass08<Double> o2 = new MyClass08<>(9.9);
		
//		MyClass08<String> o3 = new MyClass08<>("java");//안됨 Number타입으로만 제한했기 때문에
	}

}

//상한선이 있는 파라미터 bounded type parameter
//Number의 메소드까지 허용하겠다.
class MyClass08<T extends Number> {
	//private 필드
	private T item;
	
	//생성자
	public MyClass08(T item) {
		this.item = item;
	}
	
	//메소드
	public void handleItem() {
		String str = item.toString();
		int hash = item.hashCode();
		boolean eq = item.equals(null);
		
		//Number메소드까지 사용할수있게 됨 (bounded type parameter때문에)
		//int이 Number 또는 그 하위 타입이므로
		//Number의 메소드를 실행시킬 수 있음
		int i = item.intValue();
		double d = item.doubleValue();
		
		
		//아이템에 Number의 메소드를 사용하고 싶다.
		//불필요한 코드가 생성됨
//		if(item instanceof Number numItem) {//불필요
//		int i = numItem.intValue();
//		double d = numItem.doubleValue();
//		}
	}
	
	
}

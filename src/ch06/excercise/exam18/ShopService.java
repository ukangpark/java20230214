package ch06.excercise.exam18;

public class ShopService {
	//인스턴스의 주소값을 가지는 필드 선언
	private static ShopService ins;
	
	//생성자를 밖에서 접근하지 못하게 만들기
	private ShopService() {
		
	}
	
	//대신에 메소드를 공개 시켜줌
	//대신 만들어져있는 인스턴스만을 쓸수있게 제한
	//static 쓰는이유 : 
	//안쓰면 인스턴스 메소드가 되는데, 
	//그러면 인스턴스를 만들지 못하게 private으로 제한했지만 만들수있게되버림
	public static ShopService getInstance() {
		if(ins == null) {
			ins = new ShopService();
		}
		return ins;
	}

}

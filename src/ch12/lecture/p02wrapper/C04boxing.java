package ch12.lecture.p02wrapper;

public class C04boxing {
	public static void main(String[] args) {
		//사용시 주의할점
		int i1 = 30000;
		int i2 = 30000;
		
		//기본타입값을 비교
		System.out.println(i1 == i2); //true
		
		Integer o1 = i1;
		Integer o2 = i2;
		
		//참조값을 비교(사용하지 말기)
		System.out.println(o1 == o2);//? 그때그때다름 지금은 false 서로다른 객체니까 참조값이 다름
		
		//equals메소드로 안에 있는 값을 비교(참조타입이니까 안에있는 값을 비교해야함)(이메소드 사용)
		System.out.println(o1.equals(o2));
		
		
		
	}

}

package ch16.sec05.exam03;

@FunctionalInterface
public interface Creatable2 {
	//리턴 타입이 member인 추상메소드
	public Member create(String id, String name);

}

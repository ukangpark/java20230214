package ch14.lecture.p04.name;

public class C01Name {
	public static void main(String[] args) {
		//현재 쓰레드 객체 얻기
		Thread t1 = Thread.currentThread();
		
		//쓰레드 이름 얻기
		System.out.println(t1.getName());//main => jvm이 알아서 이름을 지어주는데 제일 첫번째로 생성된 메소드는 자동으로 main으로 지어짐
		
		//쓰레드 이름 바꾸기
		t1.setName("메인 쓰레드");
		
		//바뀐이름 확인하기
		System.out.println(t1.getName());//메인 쓰레드
	}
	
	

}

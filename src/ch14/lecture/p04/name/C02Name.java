package ch14.lecture.p04.name;

public class C02Name {
	public static void main(String[] args) {
		
	for (int i=0; i<3; i++) { //스레드가 생성될때마다(3번)
	Thread t1 = new Thread(()-> {
		
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName()); //이름을 얻기 (다른 스레드는 Thread-숫자로 이름을 붙임 - 순서대로 나오는게 아님)
	});
	t1.start();
	}
	}
}

package ch14.lecture.p02sleep;

public class C02Sleep {
	public static void main(String[] args) {
		System.out.println("메인쓰레드 시작");
		
		Thread t = new Thread(() -> {
			System.out.println("Thread Start");
			
			try {
				Thread.sleep(2000); //t스레드만 잠깐 2초멈추고 시작(메인쓰레드가 먼저 끝나겠죠~?)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Thread End");
		});
		t.start();
		
		System.out.println("메인쓰레드 종료");
	}

}

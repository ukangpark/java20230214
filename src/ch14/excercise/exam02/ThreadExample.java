package ch14.excercise.exam02;

public class ThreadExample {
	public static void main(String[] args) {
		// Thread를 상속받은 것을 사용하기
		Thread thread1 = new MovieThread();
		thread1.start();

		// Thread는 Runnable을 구현하고 있음. 구현하고 있는 Runnable의 인스턴스 만들기
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();

		for (int i = 0; i < 3; i++) {
			System.out.println("메인 쓰레드");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}

class MovieThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class MusicRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

		}

	}
}

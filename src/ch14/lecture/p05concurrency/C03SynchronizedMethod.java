package ch14.lecture.p05concurrency;

public class C03SynchronizedMethod {
	public static void main(String[] args) {
		//해결책 2-2
		//synchronized메소드
		//메소드전체가 synchronized블럭이 되어야한다.
		Box box = new Box();
		Thread a = new Thread(()-> {
			for (int i=0; i<100000; i++) {
				box.increase();//동시에 box의 상태를 바꾸는 코드 (잘못된예)
			}
		});
		Thread b = new Thread(()-> {
			for (int i=0; i<100000; i++) {
				box.increase();//동시에 box의 상태를 바꾸는 코드 (잘못된예)
			}
		});
		a.start();
		b.start();
		try {
		a.join();
		b.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(box.item);
	}
}
class Box {
	public int item = 0;
	public synchronized void increase() {
//		synchronized (this) {
//			item++;
//		} //synchronized블럭으로 만들면되지만, 어차피 메소드가 synchronized블럭이 된다면 메소드를 synchronized로 만들면됨
		item++;
	}
}

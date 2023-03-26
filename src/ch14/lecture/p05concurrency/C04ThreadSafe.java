package ch14.lecture.p05concurrency;

import java.util.concurrent.atomic.*;

public class C04ThreadSafe {
	static int field = 0;
	static AtomicInteger atomicField = new AtomicInteger(0);
	public static void main(String[] args) {
		Thread a = new Thread(()-> {
			for (int i=0; i<10000; i++) {
				field++;
				atomicField.getAndIncrement();
			}
		});
		Thread b = new Thread(()-> {
			for (int i=0; i<10000; i++) {
				field++;
				atomicField.getAndIncrement();
			}
		});
		
		a.start();
		b.start();
		try {
		a.join();
		b.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(field);//좋지 못한 코드 (예상하는 값이 나올수도있고 안나올수도있고)
		System.out.println(atomicField.get());//좋은 코드 (thread safe class를 사용하여, 예상하는 값이 잘나옴)
	}

}

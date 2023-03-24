package ch14.lecture.p05concurrency;

import java.util.*;

public class C05ThreadSafe {
	static List<Integer> list = Collections.synchronizedList(new ArrayList<>());

	public static void main(String[] args) {
		Thread a = new Thread(()-> {
			for (int i=0; i<10000; i++) {
				list.add(1000);
				list.remove(0);
			}
		});
		Thread b = new Thread(()-> {
			for (int i=0; i<10000; i++) {
				list.add(2000);
				list.remove(0);
	
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
		
		System.out.println("종료: " + list.size());
		
}
}

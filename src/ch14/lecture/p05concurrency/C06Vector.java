package ch14.lecture.p05concurrency;

import java.util.*;

public class C06Vector {
//	static List<Integer> list = new ArrayList<>();
	//백터사용(Threadsafe한 리스트)
	static List<Integer> list = new Vector<>();
	
	public static void main(String[] args) {
		Thread a = new Thread(()-> {
			for (int i=0; i<100000; i++) {
				list.add(9);
				list.remove(0);
			}
		});
		Thread b = new Thread(()-> {
			for (int i=0; i<100000; i++) {
				list.add(9);
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
		
		System.out.println(list);//threadsafe하지 않기 때문에 exception 발생
	}							//백터사용시 오류안남

}

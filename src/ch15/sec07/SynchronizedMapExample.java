package ch15.sec07;

import java.util.*;

public class SynchronizedMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
		
		//작업 스레드 객체 생성
		Thread a = new Thread() {
			public void run() {
				//객체 1000개 추가
				for (int i=1; i<=1000; i++) {
					map.put(i, "내용:"+i);
				}
			}
		};
		
		Thread b = new Thread( ) {
			public void run() {
				//객체 1000개 추가
				for (int i=1001; i<=2000; i++) {
					map.put(i, "내용:"+i);
				}
			}
		};
		
		//작업 스레드 실행
		a.start();
		b.start();
		
		try {
			a.join();
			b.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		//저장된 총 객체 수 얻기
		int size = map.size();
		System.out.println(size);
	}

}

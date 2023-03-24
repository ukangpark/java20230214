package ch15.sec04.exam02;

import java.util.*;

public class HashtableExample {
	public static void main(String[] args) {
		//Hashtable 컬렉션 생성
		Map<String, Integer> map = new Hashtable<>();
		
		//작업 스레드 객체 생성
		Thread a = new Thread() {
			public void run() {
				//엔트리 1000개 추가
				for(int i=0; i<1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		//작업 스레드 객체 생성
		Thread b = new Thread () {
			public void run() {
				for(int i=1001; i<=2000; i++) {
					map.put(String.valueOf(i), i);
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
		}
		
		//저장된 총 엔트리 수 얻기
		int size = map.size();
		System.out.println(size);
	}

}

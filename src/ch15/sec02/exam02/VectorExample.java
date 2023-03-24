package ch15.sec02.exam02;

import java.util.*;

import ch15.sec02.exam01.*;



public class VectorExample {
	public static void main(String[] args) {
		//Vector 컬렉션 생성
		List<Board> list = new Vector<>();
		//vector는 옛날꺼니까 사용하지말고 Collections.synchronized~~이용하자
		
		//작업 스레드 객체 생성
		Thread a = new Thread() {
			public void run() {
				//객체 1000개 추가
				for(int i=1; i<=1000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		
		//작업 스레드 객체 생성
		Thread b = new Thread() {
			public void run() {
				//객체 2000개 추가
				for(int i=1; i<=2000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		
		//작업 스레드 실행
		a.start();
		b.start();
		
		//작업ㅈ 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게함
		try {
		a.join();
		b.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println(size);
	}

}

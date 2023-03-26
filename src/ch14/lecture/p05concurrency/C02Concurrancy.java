package ch14.lecture.p05concurrency;

public class C02Concurrancy {
	static int field = 0;
	
	public static void main(String[] args) {
		//해결책2-1
		//synchronized 블럭 (동기화 블럭)
		//a가 일할때 b는 일하지 못하게, b가 일할때 a가 일하지 못하게 하는것
		//같은 객체를 획득하게 ()안에 같은 객체를 넣어줬다면, 같은일을 행하도록 만들수있음
		Object o = new Object();
		Thread a = new Thread(()-> {
			for (int i=0; i<100000; i++) {
				//o객체를 획득해야만 synchronized를 실행할수있어 -> 먼저획득한 놈이 실행되고 o객체는 반납됨
				synchronized (o) {
					field++; //뜯어봤더니 3단계로 나뉘었다. -> 뜯어봤을때 문제점이 발생되었다! => synchronized블럭안에 통으로 넣어버리자!! 
				}
			}
		}, "AThread");
		Thread b = new Thread(()-> {
			for(int i=0; i<100000; i++) {
				synchronized (o) {					
					field++;
				}
			}
		}, "BThread");	
		a.start();
		b.start();
		try {
		a.join();
		b.join();
		}catch (Exception e) {
		}
		System.out.println(field);
		
	}

}

package ch14.lecture.p05concurrency;

public class C01Concurrency {
	static int field = 0;
	
	public static void main(String[] args) {
		Thread a = new Thread(()-> {
			for (int i=0; i<10000; i++) {
				field++;
			}
		}, "A Thread");
		
		Thread b = new Thread(()-> {
			for (int i=0; i<10000; i++) {
				field++;
			}
		}, "B Thread");
		
		a.start();
		b.start();
		try {
		a.join();//a도 동시에같은일을하고
		b.join();//b도 동시에 같은일을 함
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//여러쓰레드가 하나의 객체 상태를 변경하려고 할 때 매우 주의해서 코드를 작성해야함
		//해결책1 : 여러쓰레드가 하나의 객체 상태를 변경하는 코드를 작성하지 않는다.

		System.out.println(field);//a가 일하고 난뒤에 출력해보면 field는 10000
		//-> but b도 동시에 같은 일을하면 20000이 되겠는가? 될수도있고안될수도있고
		//왜? -> 여러스레드가 어떤객체의 상태를 변경하는 것을 주의해야함
		//그럼왜 이런일이 일어남? 중요!! 그림을 확인
		
		
		
		
	}
}



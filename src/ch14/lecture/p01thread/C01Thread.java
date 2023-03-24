package ch14.lecture.p01thread;

public class C01Thread {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println(main.getName());
		
		//Thread 만들기 (thread객체 만들기)
		Thread t1 = new Thread();
		System.out.println(t1.getName());
		
		//Thread 시작
		t1.start();//만들어진 thread가 여기서 시작됨
		
		//Thread 만들기
		Thread t2 = new Thread();
		
		//Thread 시작
		t2.start();
	}

}

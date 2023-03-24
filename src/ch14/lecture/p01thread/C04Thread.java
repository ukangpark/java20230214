package ch14.lecture.p01thread;

public class C04Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			while(true) {
				System.out.println("###Thread###");
			}
		});
		
		t1.start();
		
		while(true) {
			System.out.println("@@@main thread@@@");
		}
	}

}

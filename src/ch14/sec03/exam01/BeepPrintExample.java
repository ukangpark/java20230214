package ch14.sec03.exam01;

import java.awt.*;


public class BeepPrintExample {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i=0; i<5; i++) {
				toolkit.beep();
				try {Thread.sleep(500);} catch(Exception e) {}
			}
		});
		
		t1.start();
		
		for( int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}

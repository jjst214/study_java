package day16.exam01;

import java.awt.Toolkit;

public class BeepPrintChildExam2 {

	public static void main(String[] args) throws InterruptedException {
		//스레드 생성
		Thread thread = new Thread() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		};
		thread.start();
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			Thread.sleep(1000);
		}
	}

}

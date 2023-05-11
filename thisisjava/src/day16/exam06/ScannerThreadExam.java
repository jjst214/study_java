package day16.exam06;

import java.util.Scanner;

public class ScannerThreadExam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		MyThread mt = new MyThread();
//		mt.start();
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();
		System.out.println("아무값이나 입력해주세요");
		String input = in.nextLine();
		
	}

}

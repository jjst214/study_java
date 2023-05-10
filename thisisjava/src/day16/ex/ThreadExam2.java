package day16.ex;

public class ThreadExam2 {

	public static void main(String[] args) {
		Thread thread = new MovieThread2();
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
	}

}

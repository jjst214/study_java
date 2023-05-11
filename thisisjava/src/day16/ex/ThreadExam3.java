package day16.ex;

public class ThreadExam3 {

	public static void main(String[] args) {
		Thread thread = new MovieThread3();
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

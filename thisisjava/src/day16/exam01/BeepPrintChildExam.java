package day16.exam01;

public class BeepPrintChildExam {

	public static void main(String[] args) throws InterruptedException {
//		ThreadChild thread = new ThreadChild();
		Thread thread = new Thread(new ThreadChild());
		thread.start();
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			Thread.sleep(1000);
		}
	}

}

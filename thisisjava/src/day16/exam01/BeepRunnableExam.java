package day16.exam01;

public class BeepRunnableExam {

	public static void main(String[] args) throws InterruptedException {
		//메인스레드
		//스레드 생성
		Thread thread = new Thread(new RunnalbeChild());
		thread.start();
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			Thread.sleep(1000);
		}

	}
}
package day16.exam02;

public class JoinExam {

	public static void main(String[] args) {
		SumThread thread = new SumThread();
		thread.start();
		try {
			thread.join(); //join메소드를 실행시킨 main스레드는 thread 스레드가 종료될 때 까지 일시정지 상태가 됨.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~100까지의 합 : " + thread.getSum());
	}

}

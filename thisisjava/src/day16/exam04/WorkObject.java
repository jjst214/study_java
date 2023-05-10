package day16.exam04;

public class WorkObject {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "methodA 작업 실행");
		//다른 스레드를 실행 대기 상태로 변경(일시정지상태인 스레드를 실행대기 상태로)
		notify();
		try {
			wait(); //자신의 스레드는 일시정지 상태로 변경
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "methodB 작업 실행");
		notify();
		try {
			wait(); //자신의 스레드는 일시정지 상태로 변경
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

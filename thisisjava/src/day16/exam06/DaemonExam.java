package day16.exam06;


public class DaemonExam {

	public static void main(String[] args) {
		AutoSaveThread autosave = new AutoSaveThread(); //1초마다 저장메시지를 출력하는 무한반복 thread
		autosave.setDaemon(true); //데몬스레드로 지정(메인스레드가 종료되면 무한반복 thread도 함께 종료됨)
		autosave.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드 종료");
		
		
	}

}

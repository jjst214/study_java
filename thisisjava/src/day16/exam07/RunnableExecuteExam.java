package day16.exam07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExam {

	public static void main(String[] args) {
		//1000개의 배열 생성
		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member" + i + "@my.com";
			mails[i][2] = "신상품입고";
		}
		
		//스레드풀 생성 - 최대스레드 수 : 5
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		//이메일을 보내는 작업 생성 및 처리요청
		//스레드풀.execute(Runnable 구현객체)
		for(int i=0; i<1000; i++) {
			final int idx = i;
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					//실행중인 스레드
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("[" + thread.getName() + "]" + from + " ==> " + to + " : " + content);
				}
			});
		}
		//ExecutorService의 스레드가 모든 작업을 마친 뒤에 종료
		executorService.shutdown();
	}

}

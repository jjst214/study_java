package day16.ex;

public class MovieThread2 extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			if(Thread.interrupted()) {
				break;
			}
		}
	}
	
}

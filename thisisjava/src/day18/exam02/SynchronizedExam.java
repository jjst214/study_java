package day18.exam02;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedExam {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
		//작업스레드 객체 생성
		Thread threadA = new Thread() {

			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					map.put(i, "내용"+i);
				}
			}
			
		};
		Thread threadB = new Thread() {

			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					map.put(i, "내용"+i);
				}
			}
			
		};
		threadA.start();
		threadB.start();
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(map.size());
	}
}

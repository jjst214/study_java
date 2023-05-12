package day17.exam03;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExam {

	public static void main(String[] args) {
		//hashtable 컬렉션 생성 (hashMap << 비동기화, hashtable << 동기화*멀티스레드 환경에서 유리)
		Map<String, Integer> map = new Hashtable<>();
		//작업스레드 생성 객체
		Thread threadA = new Thread(new Runnable() {
			@Override
			public void run() {
				//엔트리 1000개 추가
				for(int i=1; i<=1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		});
		Thread threadB = new Thread(new Runnable() {
			@Override
			public void run() {
				//엔트리 1000개 추가
				for(int i=1001; i<=2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		});
		threadA.start();
		threadB.start();
		
		//작업스레드가 모두 종료될 때 까지 메인스레드 대기
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//저장된 총 엔트리 수
		int size = map.size();
		System.out.println("총 엔트리 수 : " + size);
	}

}

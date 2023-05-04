package day13.exam04;

public class TimeExam {
	public static void main(String[] args) {
		//currentTimeMillis()  1/1000 초단위 (기준:1970년 1월 1일 0시부터 현재까지의 시간을 '밀리'초 단위로 return)
		//nanoTime()  1/10^9 초단위 (기준:1970년 1월 1일 0시부터 현재까지의 시간을 '나노'초 단위로 return)
		long time1 = System.currentTimeMillis();
		int sum = 0;
		for(int i=0; i<=100000000; i++) {
			sum += i;
		}
		for(int i=0; i<=100000000; i++) {
			sum += i;
		}
		for(int i=0; i<=100000000; i++) {
			sum += i;
		}
		for(int i=0; i<=100000000; i++) {
			sum += i;
		}
		long time2 = System.currentTimeMillis();
		System.out.println("계산에 " + (time2-time1) + "밀리초가 소요됐습니다.");
	}
}

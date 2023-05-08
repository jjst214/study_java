package day13.ex;

public class exam564page_08 {

	public static void main(String[] args) {
		long a = System.nanoTime();
		int[] scores = new int[1000];
		for(int i=0; i<scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score: scores) {
			sum += score;
		}
		
		double avg = sum/scores.length;
		System.out.println(avg);
		long b = System.nanoTime();
		
		System.out.println("소요된 나노초 : " + (b-a));
	}

}

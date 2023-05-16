package day19.ex;

public class OperatorExam717p {
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin((x,y) ->{
			return x>y ? x : y;
		});
		System.out.println("최대값: " + max);
		
		int min = maxOrMin((x, y) ->{
			return x<y ? x : y;
		});
		System.out.println("최소값: " + min);
	}
}
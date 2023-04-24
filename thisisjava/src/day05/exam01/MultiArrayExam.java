package day05.exam01;

public class MultiArrayExam {

	public static void main(String[] args) {
		//각 반의 학생수가 3명으로 동일 할 경우 점수 저장을 위한 2차원 배열
		int[][] mathScore = new int[2][3];
		mathScore[0][0] = 80;
		mathScore[0][1] = 83;
		mathScore[0][2] = 85;
		mathScore[1][0] = 86;
		mathScore[1][1] = 90;
		mathScore[1][2] = 92;
		
		
		int[] scores = {1,2,3};
		
		int mathSum = 0;
		for(int i=0; i<mathScore.length; i++) {
			for(int k=0; k<mathScore[1].length; k++) {
				mathSum += mathScore[i][k];
			}
		}
		System.out.println(mathSum);
		
		int[][] engScore = {
				{80,83,85},
				{86,92}
		};
		System.out.println("engScore의 배열 길이는 " + engScore.length);
		System.out.println("engScore[0]의 배열 길이는 " + engScore[0].length);
		System.out.println("engScore[1]의 배열 길이는 " + engScore[1].length);
	}

}

package day05.exam01;

public class ArrayExam {

	public static void main(String[] args) {
		String[] fruits = {"🙏", "🍒", "🍓", "🍊", "🍉"};
		
		for(int i=0; i<5; i++) {
			System.out.println(fruits[i]);
		}
		//배열항목의 값 변경
		fruits[0] = "🍅";
		System.out.println(fruits[0]);
		
		int[] intArr = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println(intArr[i]);
		}
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 40;
		intArr[4] = 50;
		for(int i=0; i<5; i++) {
			System.out.println(intArr[i]);
		}
		
		String[] strArr = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println(strArr[i]);
		}
		strArr[0] = "그린";
		strArr[1] = "블루";
		strArr[2] = "레드";
		for(int i=0; i<3; i++) {
			System.out.println(strArr[i]);
		}
		
		int[] number = new int[10];
		for(int i=0; i<10; i++) {
			number[i] = i+1;
		}
		for(int i=0; i<10; i++) {
			System.out.println(number[i]);
		}
		
		//배열 변수 선언
		int[] scores;
		//배열 변수 대입
//		scores = {83,90,76}; 에러발생
		scores = new int[] {83,90,76};
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
	}

}

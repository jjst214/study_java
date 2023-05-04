package day13.exam07;

import java.util.Random;

public class MathExam {

	public static void main(String[] args) {
		double v1 = Math.ceil(5.3);		//올림
		double v2 = Math.floor(5.3);	//내림
		double v3 = Math.round(5.3);	//반올림
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		int i1 = Math.abs(-123);
		System.out.println(i1);
		
		int i2 = Math.max(10,20);
		System.out.println(i2);
		int i3 = Math.min(10,20);
		System.out.println(i3);
		
		//소수 이하 2자리 얻기
		double value = 12.3456;
		double temp1 = value*100; //1234.56
		long temp2 = Math.round(temp1); //1235
		double v4 = temp2 / 100.0; //12.35
		System.out.println(v4);
		
		System.out.println(Math.random());
		int[] selectNum = new int[6];
		int[] selectNum2 = new int[6];
		Random random = new Random(3); //new Random(n) n=종자값, 비워두면 만들때마다 랜덤한 숫자가 나오고 임의의 종자값을 정해 넣어줄 수 있음
										//현재 3이라는 종자값을 넣어 만들어진 random 변수를 사용해 random.nextInt를 돌리면 같은 랜덤값이 나온다
		
		for(int i=0; i<6; i++) {
			selectNum[i] = random.nextInt(45)+1; //1~45까지 랜덤한 수(+1 빼면 0~44까지)
		}
		for(int a:selectNum) {
			System.out.println(a);
		}
		for(int i=0; i<6; i++) {
			selectNum2[i] = random.nextInt(10)+1;	
		}
		for(int a:selectNum) {
			System.out.println(a);
		}
	}

}

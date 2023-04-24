package day05.exam01;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		//1~45번까지 중복없이 랜덤으로 6개 숫자 출력하기
		int[] lotto = new int[6];
		//번호 생성
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1; //1~45중 랜덤
			//중복 번호 제거
			for(int k=0; k<i; k++) {
				if(lotto[i] == lotto[k]) {
					i--;
					break;
				}
			}
		}
//		System.out.print("로또번호 : ");
//		for(int i=0; i<6; i++) {
//			System.out.print(lotto[i] + " ");
//		}
		
		Scanner in = new Scanner(System.in);
		int[] nums = new int[10];
//		
//		System.out.print("정수를 10개 입력하세요>");
//		for(int i=0; i<10; i++){
//			nums[i] = in.nextInt();
//			if(nums[i] >= 10000) {
//				System.out.println("10000이상의 수를 입력했습니다." + (i+1) + "번째 부터 다시 입력하세요");
//				i--;
//			}
//		}
//		int maxNum = 0;
//		int minNum = 10000;
//		for(int i=0; i<nums.length; i++) {
//			if(nums[i] % 2 == 0) {
//				if(nums[i]>maxNum) {
//					maxNum = nums[i];
//				}
//				
//			}
//			else{
//				if(nums[i]<minNum) {
//					minNum = nums[i];
//				}
//			}
//		}
//		System.out.println("짝수 최대 값 : " + maxNum + ", 홀수 최소 값 : " + minNum);
		
		int[] arr = {95, 75, 85, 100, 50};
		int tmp = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int k=i+1; k<arr.length; k++) {
				if(arr[i] > arr[k]) {
					tmp = arr[i];
					arr[i] = arr[k];
					arr[k] = tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}

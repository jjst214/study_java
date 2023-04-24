package day05.exam01;

import java.util.Scanner;

public class ArrayExam03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//제일 큰 수 구하기
		//숫자 5개를 입력받고 배열에 넣고 그 중 가장 큰 수 구하기
		int[] nums = new int[5];
		System.out.println("숫자 5개 입력하세용");
		System.out.print(">");
		for(int i=1; i<nums.length; i++) {
			nums[i] = in.nextInt();
		}
		//큰 수를 담을 변수에 0번째 값을 할당
		int minNum = nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i] < minNum) {
				minNum = nums[i];
			}
		}
		System.out.println(minNum);
		in.close();
	}
}

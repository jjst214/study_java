package day05.exam01;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] nums = new int[5];
		System.out.println("5개의 숫자를 입력하세요");
		for(int i=0; i<nums.length; i++){
			System.out.println(i+1 + "번 째 숫자를 입력하세요");
			nums[i] = in.nextInt();
		}
		
		int tmp = 0;
		for(int i=0; i<nums.length-1; i++) {
			for(int k=i+1; k<nums.length; k++) {
				if(nums[i]<nums[k]) {
					tmp = nums[i];
					nums[i] = nums[k];
					nums[k] = tmp;
				}
			}
		}
		System.out.print("5개 숫자의 내림차순 정렬 : ");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}

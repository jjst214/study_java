package day02.sec02;

import java.util.Scanner;

public class IfElseIFExam {

	public static void main(String[] args) {
//		int score = 75;
		
//		if(score>=90) {
//			System.out.println("A");
//		}else if(score>=80){
//			System.out.println("B");
//		}else if(score>=70){
//			System.out.println("C");
//		}else if(score>=60){
//			System.out.println("D");
//		}else {
//			System.out.println("E");
//		}
		
//		int iRandom = (int)(Math.random()*6)+1;
//		System.out.println(iRandom);
//		if(iRandom==1) {
//			System.out.println("1입니다.");
//		}else if(iRandom==2) {
//			System.out.println("2입니다.");
//		}else if(iRandom==3) {
//			System.out.println("3입니다.");
//		}else if(iRandom==4) {
//			System.out.println("4입니다.");
//		}else if(iRandom==5) {
//			System.out.println("5입니다.");
//		}
//		else{
//			System.out.println("6입니다.");
//		}
		
//		switch(iRandom) {
//		case 1:
//			System.out.println("1입니다");
//			break;
//		case 2:
//			System.out.println("2입니다");
//			break;
//		case 3:
//			System.out.println("3입니다");
//			break;
//		case 4:
//			System.out.println("4입니다");
//			break;
//		case 5:
//			System.out.println("5입니다");
//			break;
//		default:
//			System.out.println("6입니다");
//		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year = in.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("평년입니다.");
		}
		
//		if(year%4==0) {
//			if(year%100!=0 || year%400==0) {
//				System.out.println("윤년입니다.");
//			}else {
//				System.out.println("평년입니다.");
//			}
//		}else {
//			System.out.println("평년입니다.");
//		}
	}
}

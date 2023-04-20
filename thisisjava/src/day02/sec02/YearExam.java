package day02.sec02;

import java.util.Scanner;

public class YearExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
//		System.out.print("년도를 입력하세요 : ");
//		int year = in.nextInt();
		
//		if(year%4==0) {
//			if(year%100==0) {
//				if(year%400==0) {
//					System.out.println("윤년입니다.");
//				}else {
//					System.out.println("평년입니다.");
//				}
//			}else {
//				System.out.println("윤년입니다.");
//			}
//		}else {
//			System.out.println("평년입니다.");
//		}
		while(true) {
			System.out.print("가위, 바위, 보 중 하나를 입력하세요 : ");
			String game = in.nextLine();
			int random = (int)(Math.random()*3)+1;
			
			if(game.equals("가위") || game.equals("바위") || game.equals("보")) {
				//비겼을때
				if(game.equals("가위") && random == 1 || game.equals("바위") && random == 2 || game.equals("보") && random == 3) {
					if(game.equals("가위")) {
						System.out.println("컴퓨터:가위, 유저:가위 비겼습니다.");
					}else if(game.equals("바위")) {
						System.out.println("컴퓨터:바위, 유저:바위 비겼습니다.");
					}else {
						System.out.println("컴퓨터:보, 유저:보 비겼습니다.");
					}
				}else {
					//졌을때
					if(game.equals("가위") && random == 2 || game.equals("바위") && random == 3 || game.equals("보") && random == 1) {
						if(game.equals("가위")) {
							System.out.println("컴퓨터:바위, 유저:가위 졌습니다.");
						}else if(game.equals("바위")){
							System.out.println("컴퓨터:보, 유저:바위 졌습니다.");
						}else {
							System.out.println("컴퓨터:가위, 유저:보 졌습니다.");
						}
					}else {
						//이겼을때
						if(game.equals("가위") && random == 3 || game.equals("바위") && random == 1 || game.equals("보") && random == 2) {
							if(game.equals("가위")) {
								System.out.println("컴퓨터:보, 유저:가위 이겼습니다.");
							}else if(game.equals("바위")){
								System.out.println("컴퓨터:가위, 유저:바위 이겼습니다.");
							}else {
								System.out.println("컴퓨터:바위, 유저:보 이겼습니다.");
							}
						}
					}
				}
			}else {
				System.out.println("가위, 바위, 보를 입력하지 않았습니다.");
			}
		}
	}

}

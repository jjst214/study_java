package day05.exam01;

import java.util.Scanner;

public class Arraydasda {

	public static void main(String[] args) {
		//문제7번
//		int[] array = {1,5,3,8,2};
//		int maxNum = array[0];
//		for(int i=0; i<array.length; i++) {
//			if(maxNum<array[i]) {
//				maxNum = array[i];
//			}
//		}
//		System.out.println(maxNum);
		
		
		
		//문제8번
//		int[][] array= {
//				{95,86},
//				{83,92,96},
//				{78,83,93,87,88}	
//		};
//		
//		int sum = 0;
//		double average = 0.0;
//		for(int i=0; i<array.length; i++) {
//			for(int k=0; k<array[i].length; k++) {
//				sum += array[i][k];
//				average = sum / array[i][k];
//			}
//		}
//		System.out.println(sum);
//		System.out.println(sum/average);
		
		
		//문제9번
		Scanner in = new Scanner(System.in);
		boolean run = true;
		int sum = 0;
		int[] stdCount = null;
		int[] stdScore = null;
		int tmp = 0;
		while(run){
			
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			String input = in.nextLine();
			
			//1~5번 외에 다른거 입력할 경우
			if(input.equals("1")||input.equals("2")||input.equals("3")||input.equals("4")||input.equals("5")) {
				
				//학생수
				if(input.equals("1")) {
					System.out.print("학생수> ");
					try {
						stdCount = new int[Integer.parseInt(in.nextLine())];
					}catch(Exception e) {
						e.printStackTrace();
					}
					
					
				}
				//점수입력
				else if(input.equals("2")) {
					//학생수 check
					if(stdCount == null || stdCount.length == 0) {
						System.out.println("학생수를 입력하지 않았거나 학생수가 0명입니다. 학생수를 먼저 입력하세요.");
					}
					else {
						//학생 수 만큼 점수받을 배열 생성
						stdScore = new int[stdCount.length];
						
						System.out.print("점수입력> ");
						for(int i=0; i<stdCount.length; i++) {
							System.out.print(stdCount.length + "명 중 " + (i+1) + "명째 점수 입력>");
							stdScore[i] = Integer.parseInt(in.nextLine());
							System.out.println();
							
							//점수 합계 미리구해놓기
							sum += stdScore[i];
						}
					}
				}
				//점수리스트
				else if(input.equals("3")) {
					//점수 check
					if(stdScore == null || stdScore.length == 0) {
						System.out.println("점수를 입력하지 않았습니다. 점수를 입력해주세요.");
					}
					else {
						System.out.println("점수리스트> ");
						for(int i=0; i<stdScore.length-1; i++) {
							for(int k=i+1; k<stdScore.length; k++) {
								if(stdScore[i]<stdScore[k]) {
									tmp = stdScore[i];
									stdScore[i] = stdScore[k];
									stdScore[k] = tmp;
								}
							}
						}
						//점수 내림차순 출력
						System.out.println("학생 " + stdCount.length + "명의 점수 내림차순 출력");
						for(int i=0; i<stdScore.length; i++) {
							System.out.println("scores[" + i + "]> " + stdScore[i]);
						}
					}
				}
				//분석
				else if(input.equals("4")) {
					//점수 check
					if(stdScore == null || stdScore.length == 0) {
						System.out.println("점수를 입력하지 않았습니다. 점수를 입력해주세요.");
					}
					else {
						System.out.println("분석> ");
						System.out.println("최고 점수는 " + stdScore[0] + " 점 입니다.");
						System.out.printf("평균 점수는 " + "%.3f" + " 점 입니다.\n",sum/(double)stdScore.length);
					}
				}
				//종료
				else if(input.equals("5")) {
					System.out.print("프로그램 종료");
					run = false;
				}
			}
			else {
				System.out.println("잘못 입력했음. 1~5번중 하나만 입력해주세요");
			}
		}
	}

}

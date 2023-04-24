package day05.exam01;

public class BreakOutterExam {

	public static void main(String[] args) {
		Outter: for(int i=1; i<5; i++) {
			for(int k=1; k<5; k++) {
				System.out.println("i는 : " + i + " k는 : " + k);
				if(i == 2) {
					break Outter;
				}
			}
		}
	}

}

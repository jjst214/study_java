package day03.exam01;

public class StarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<5; i++) {
			for(int k=4; k>=0; k--) {
				if(i>=k) {
					System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
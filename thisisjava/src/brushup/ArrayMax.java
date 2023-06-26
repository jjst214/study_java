package brushup;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int val;
		int max = 0;
		for(int i=0; i<5; i++) {
			System.out.println(i+1 + "번 째 숫자를 입력하이소 : ");
			try {
				val = in.nextInt();
				if(max<val) {
					max = val;
				}
			}catch(Exception e) {
				e.printStackTrace();
				return;
			}
		}
		System.out.println("가장 큰 수는 " + max);
	}

}

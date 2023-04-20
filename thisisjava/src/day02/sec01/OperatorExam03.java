package day02.sec01;

public class OperatorExam03 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result = num1 == num2;
		boolean result2 = num1 != num2;
		
		System.out.println(result);
		System.out.println(result2);

		
		int num3 = 20;
		int num4 = 30;
		boolean result3 = num3 < num4;
		boolean result4 = num3 >= num4;
		
		System.out.println(result3);
		System.out.println(result4);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result5 = char1 < char2;
		
		System.out.println(result5);
		
		float f = 0.1f;
		double d = 0.1;
		boolean result6 = f == (float)d;
		
		System.out.println(result6);
		
		//복합대입연산자
		int x = 10;
		x += 2; //10->12
		x -= 2; //12->10
		x *= 2; //10->20
	
	}

}

package day07exam01;

public class CalculatorExam {

	public static void main(String[] args) {
		//정적 메소드는 객체를 생성하지 않아도 호출 할 수 있음
		System.out.println(Calculator.pi);
		
		Calculator calc = new Calculator();
		int result = calc.divide(50, 5);
		int result2 = calc.plus(10, 20);
		System.out.println(result);
		System.out.println(result2);
	}

}

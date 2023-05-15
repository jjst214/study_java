package day19.exam01;

public class ClaculableExam {

	public static void main(String[] args) {
		Calculable calculable1 = new Calc1();
		Calculable calculable2 = new Calc2();
		action(calculable1);
		action(calculable2);
		
		action((x,y) ->{
			System.out.println("람다식 출력 곱셈: " + (x * y));
		});
	}
	public static void action(Calculable calc) {
		int x = 10;
		int y = 20;
		calc.calculable(x, y);
	}
}

package day13.exam06;

public class BoxingExam {

	public static void main(String[] args) {
		//Boxing
		Integer obj1 = 200; //new Integer() 안해도 자동박싱
		Integer obj2 = 300;
		Integer obj3 = new Integer(600);
		
		//unBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		//기본타입 변수에 포장타입 변수 대입시 자동 언박싱(위아래 똑같음)
		int value4 = obj1;
		int value5 = obj2;
		int value6 = obj3;
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		Integer num1 = 200;
		Integer num2 = 200;
		
		//(예외)-128~127 사이의 값을 가지는 포장객체는 같은 번지를 가지기 때문에 비교연산자로 비교해도 true가 나옴
		Integer num3 = 100;
		Integer num4 = 100;
		
		System.out.println(num1==num2); // 포장된 '객체'이기 때문에 비교할시 값이 아니라 객체의 주소를 비교하기때문에 false가 나옴
		System.out.println(num1.equals(num2)); // 객체의 값은 equals로 비교가능
		
		System.out.println(num3==num4);
		System.out.println(num3.equals(num4));
		
		int a =Integer.parseInt("1220");
		float f = Float.parseFloat("2.456f");
		boolean b = Boolean.parseBoolean("true");
	}

}

package day01.exam02;

public class PromotionExam {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		
		char charValue = 'A';
		int intValue2 = charValue;
		System.out.println(intValue2);
		
		int intValue3 = 100;
		long longValue = intValue3;
		
		float floatValue = 1.123f;
		double doubleValue = floatValue;
		
		
		int intValue4 = (int)floatValue;
		
		int intValue5 = 44032;
		char charValue2 = (char)intValue5;
		System.out.println(charValue2);
		
		int intValue6 = (int)3.14;
		System.out.println(intValue6);

	}

}

package day20.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysStreamExam {

	public static void main(String[] args) {
		//배열을 이용한 스트림
		
//		String[] strArray = {"김미나", "이그린", "김블루"};
//		Stream<String> strStream = Arrays.stream(strArray);
//		strStream.forEach(val->System.out.println(val));
//		
//		int[] intArray = {1,2,3,4,5};
//		IntStream intStream = Arrays.stream(intArray);
//		intStream.forEach(val->System.out.println(val*2));
		
		//배열 범위 지정 range = 마지막 숫자 제외, rangeClosed = 마지막 숫자 포함
		IntStream intStream2 = IntStream.rangeClosed(1,10);
		intStream2.forEach(val->System.out.println(val));
	}

}

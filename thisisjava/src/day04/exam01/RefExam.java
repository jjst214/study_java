package day04.exam01;

public class RefExam {

	public static void main(String[] args) {
		String str1 = "김그린그린";
		String str2 = str1;
		String str3 = new String("김그린");
		String str4 = new String("김그린");
		String str5 = null;
		System.out.println(str1 == str2); //참조 주소가 같기에 true 반환
		System.out.println(str3 == str4); //str3과 str4는 값은 같지만 참조변수의 주소가 다르기 때문에 false 값을 비교하려면 equals 사용
		System.out.println(str1.charAt(2));
		int int1 = new Integer(1);
		int int2 = new Integer(1);
		System.out.println(int1 == int2); //int는 기본타입변수기 때문에 객체가 생성되지않아 바로 비교가능
	}

}

package day04.exam01;

public class StringMethod {

	public static void main(String[] args) {
		String str = "그린컴퓨터아카데미";
		
		//문자열 길이가 몇
		int strNum = str.length();
		System.out.println("length : " + strNum);
		
		//n번째의 문자의 값
		char ch = str.charAt(2);
		System.out.println("charAt(2) : " + ch);
		
		
		String str2 = "파이썬은 재미있다.";
		//a문자열을 b문자열로 변경
		String str3 = str2.replace("파이썬은", "자바는");
		System.out.println("replace(\"파이썬은\",\"자바는\") : " + str3);
		
		String str4 = "javascript";
		//a번째부터 b이전 문자열 값
		String str5 = str4.substring(0,4);
		System.out.println("substring(0,4) : " + str5);
		
		//c라는 문자의 인덱스(몇번째 문자인지)
		int str6 = str4.indexOf("c");
		System.out.println("indexOf(\"c\") : " + str6);
		//java 라는 문자열이 포함되있으면 true 없으면 false
		boolean isjava = str4.contains("java");
		System.out.println(isjava);
		
		
		//문자열을 배열로 변경
		String names = "그린, 블루, 오렌지";
		String[] names2 = names.split(",");
		System.out.println("split(\",\") 3번째 배열값 : " + names2[2]);
	}

}

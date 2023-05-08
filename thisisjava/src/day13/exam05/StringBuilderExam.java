package day13.exam05;

public class StringBuilderExam {

	public static void main(String[] args) {
		//기본적으로 string 객체는 변경이 불가능하기 때문에 string+string 문자열 결합을 하면 객체가 여러번 생성되어 성능적으로 좋지 않기 때문에
		//stringbuilder를 사용하면 성능적으로 더 좋다
		StringBuilder data = new StringBuilder();
		data.append("green");
		data = data.insert(2, "ABC");
		String str = data.toString();
		System.out.println(str);
		
		data = data.delete(2, 4);
		String str2 = data.toString();
		System.out.println(str2);
		
		data = data.replace(0, 2, "aaaaaa");
		String str3 = data.toString();
		System.out.println(str3);
	}

}

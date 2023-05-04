package day13.exam05;

public class StringBuilderExam {

	public static void main(String[] args) {
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

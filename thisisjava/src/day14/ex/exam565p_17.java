package day14.ex;

import java.util.regex.Pattern;

public class exam565p_17 {

	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[a-zA-z][a-zA-z0-9]{7,11}"; //첫글자는 대소문자 알파벳, 두번째글자는 대소문자숫자 아무거나 되는데 한자리만이 아니라 8~12자리까지
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		}else {
			System.out.println("Id로 사용할 수 없습니다.");
		}
	}

}

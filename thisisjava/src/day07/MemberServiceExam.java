package day07;

public class MemberServiceExam {

	public static void main(String[] args) {
		MemberService a = new MemberService();
		
		boolean result = a.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			a.logout("hong");
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}

package day13.exam01;

public class MemberExam {

	public static void main(String[] args) {
		Member m1 = new Member("green");
		Member m2 = new Member("green");
		Member m3 = new Member("blue");
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		
	}

}

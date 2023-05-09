package day15.exam04;

public class Course {
	//모든 사람이 등록가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이가 Course1을 등록함");
	}
	//학생만 등록가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이가 Course2을 등록함");
	}
	//직장인 일반인 등록가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이가 Course3을 등록함");
	}
}

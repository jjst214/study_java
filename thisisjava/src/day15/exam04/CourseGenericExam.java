package day15.exam04;

public class CourseGenericExam {

	public static void main(String[] args) {
		Person person1 = new Person();
		Course.registerCourse1(new Applicant<Person>(person1));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
	}

}

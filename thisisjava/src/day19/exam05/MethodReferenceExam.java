package day19.exam05;

public class MethodReferenceExam {

	public static void main(String[] args) {
		Person person = new Person();
		person.ordering((a,b) -> a.compareToIgnoreCase(b));
//		person.ordering(String::compareToIgnoreCase); //이렇게도 줄일 수 있음
	}

}

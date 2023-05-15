package day19.exam02;

public class PersonLamdaExam {

	public static void main(String[] args) {
		Person person = new Person();
		person.action1((name,job)->System.out.println(name + "이 " + job.replace("머", "밍") + "을 합니다."));
		person.action2(content->System.out.println(content + " 라고 말합니다."));
	}

}

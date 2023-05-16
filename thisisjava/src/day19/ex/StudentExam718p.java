package day19.ex;

public class StudentExam718p {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	//avg() 메소드
	public static double avg(Function2<Student> fun) {
		double avg = 0;
		for(Student s : students) {
			avg += fun.apply(s) / students.length;
		}
		return avg;
	}
	
	public static void main(String[] args) {
		// 1.engAvg 익명구현객체
//		double englishAvg = avg(new Function2<Student>() {
//			@Override
//			public double apply(Student t) {
//				return t.getEnglishScore();
//			}
//		});
		
		// 2.engAvg 람다식
//		double englishAvg = avg(s -> s.getEnglishScore());
		
		// 3.engAvg 메소드 참조
		double englishAvg = avg(Student::getEnglishScore);
		System.out.println("영어 평균 점수: " + englishAvg);
		
/* ==========================================================*/
		
		// 1.mathAvg 익명구현객체
//		double mathAvg = avg(new Function2<Student>() {
//			@Override
//			public double apply(Student t) {	
//				return t.getMathScore();
//			}
//		});
		
		// 2.mathAvg 람다식
//		double mathAvg = avg(s -> s.getMathScore());
		
		// 3.mathAvg 메소드 참조
		double mathAvg = avg(Student::getMathScore);
		System.out.println("영어 평균 점수: " + mathAvg);
	}

}

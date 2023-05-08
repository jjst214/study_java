package day13.ex;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		//객체마다 hashcode는 각각 다르지만 리턴값을 studentNum(string타입)의 hashcode로 바꿔놨기 때문에 문자열만 같으면 같은 객체로 인식되게 재정의함
		//string 객체는 객체 하나만 생성되어서 참조만 시키기 때문에 문자열이 같으면 해시코드도 같게 나온다.
		//ex) String a = "123" / String b = "123" 을 하면 "123"이라는 문자열을 가진 string객체 한개만 생성되서 a,b가 같은 객체를 참조하기때문에 해시코드가 똑같음
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(studentNum.equals(target.studentNum)) {
				return true;
			}
		}
		return false;
	}
	
	
}

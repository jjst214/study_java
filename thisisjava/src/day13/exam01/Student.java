package day13.exam01;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() { return no; }
	public String getName() { return name; }
	
	
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			//Object 타입이 Student 클래스의 인스턴스면
			//Strudent 타입으로 타입변환 후 target 에 대입
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
}

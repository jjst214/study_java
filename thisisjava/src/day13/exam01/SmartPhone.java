package day13.exam01;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	
	//Object의 toString() 재정의(원래 오브젝트의 toString()은 16진수 해시코드 반환)
	//제조사와 운영체제가 결합된 문자열 리턴
	@Override
	public String toString() {
		return company + ", " + os;
	}
	
}

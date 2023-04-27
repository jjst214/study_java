package day08.exam01;

public class SmartPhone extends Phone {
	public boolean wifi;
	public String company;
	
	public SmartPhone(String model, String color) {
		//super(); ---> 기본 생성자만 생략가능.
//		this.model = model;
//		this.color = color;
//		super(model, color); //매개 변수가 있는 생성자를 사용할때는 super() 사용 해야함.
		this(model, color, "회사");
		
	}
	public SmartPhone(String model, String color, String company) {
		super(model, color);
		this.company = company;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	public void internet() {
		System.out.println("시스템에 연결합니다.");
	}
}

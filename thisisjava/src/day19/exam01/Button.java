package day19.exam01;

public class Button {
	@FunctionalInterface
	//정적 중첩 인터페이스(클래스 안에 인터페이스)
	public static interface ClickListener{
		//추상메소드 1개(함수형 인터페이스)
		void onClick();
	}
	//필드
	private ClickListener clickListener;
	
	//메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}

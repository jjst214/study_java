package day11.exam03;

public class Button {
	//필드
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
//		listener.onClick();
	}
	
	//중첩 인터페이스(정적 멤버 인터페이스)
	static interface OnClickListener{
		void onClick();
	}
	
	
}

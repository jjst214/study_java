package day11.exercise;



public class Car2 {
	private ClickListener listener;
	
	public static interface ClickListener{
		void onClick();
	}
	
	public void setListener(ClickListener listener) {
		this.listener = listener;
	}

	public void click() {
		this.listener.onClick();
	}
}

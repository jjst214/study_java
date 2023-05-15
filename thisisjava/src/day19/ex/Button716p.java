package day19.ex;

public class Button716p {
	@FunctionalInterface
	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}

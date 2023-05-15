package day19.exam01;

public class ButtonExam {

	public static void main(String[] args) {
		Button btn = new Button();
		btn.setClickListener(()->{
			System.out.println("ok버튼을 클릭했습니다");
		});
		btn.click();
		
		Button btn2 = new Button();
		btn2.setClickListener(()->
			System.out.println("cancel버튼을 클릭했습니다")
		);
		btn2.click();
	}

}

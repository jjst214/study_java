package day19.ex;

public class ClickLamdaExam716p {

	public static void main(String[] args) {
		Button716p btnOk = new Button716p();
		btnOk.setClickListener(()->System.out.println("ok 버튼을 클릭했습니다."));
		btnOk.click();

		Button716p btnCancel = new Button716p();
		btnCancel.setClickListener(()->System.out.println("cancel 버튼을 클릭했습니다."));
		btnCancel.click();
		
		Button716p btnCancel2 = new Button716p();
		btnCancel2.setClickListener(new Button716p.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("cancel2 버튼을 클릭했습니다.");
			}
		});
		btnCancel2.click();
	}

}

package day11.exercise;

public class CarExam2 {

	public static void main(String[] args) {
		Car2 a = new Car2();
		Car2 b = new Car2();
		class ok implements Car2.ClickListener{

			@Override
			public void onClick() {
				System.out.println("ok 클릭합니다.");
			}
			
		}
		a.setListener(new ok());
		a.click();
		
		a.setListener(new Car2.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("1 클릭합니다.");
			}
		});
		b.setListener(new Car2.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("2 클릭합니다.");
			}
		});
		a.click();
		b.click();
		
		
	}

}

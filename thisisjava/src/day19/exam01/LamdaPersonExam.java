package day19.exam01;

public class LamdaPersonExam {

	public static void main(String[] args) {
		Person p = new Person();
		p.action(new Workable() {
			@Override
			public void work() {
				System.out.println("익명구현객체 오버라이딩 메소드 실행");
			}
		});
		p.action(()->
			System.out.println("람다식 오버라이딩 메소드 실행") //실행구문이 한줄이면 실행부 { } 생략가능
		);
	}

}

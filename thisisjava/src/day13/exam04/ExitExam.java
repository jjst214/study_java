package day13.exam04;

public class ExitExam {

	public static void main(String[] args) {
		//System.exit(index) 프로세스를 종료시키는 메소드
		//index >>정상종료일땐 0, 비정상 종료일땐 1,-1
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				System.out.println("프로세스 강제종료");
				System.exit(0);
			}
		}
	}

}

package day10.exam03;

public class ServiceExam {

	public static void main(String[] args) {
		Service sv = new ServiceImpl();
		
		//디폴트 메소드 호출
		sv.defaultMethod1();
		sv.defaultMethod2();
		
		//정적 메소드 호출
		Service.staticMethod1();
		Service.staticMethod2();
	}

}

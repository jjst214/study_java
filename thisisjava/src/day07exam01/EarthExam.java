package day07exam01;

public class EarthExam {

	public static void main(String[] args) {
		//상수 읽기 (정적 속성이기 때문에 객체를 만들지 않고 클래스로 바로 접근가능) 
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS);
		System.out.println("지구의 표면적 : " + Earth.EARTH_SURFACE_AREA);
	}

}

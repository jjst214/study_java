package day07exam01;

public class Earth {
	//상수선언 초기화 (초기화 방법1. 변수 생성하면서 값 초기화)
	static final double EARTH_RADIUS = 6400; //상수 변수명은 대문자로만 작성
	
	
	//상수선언
	static final double EARTH_SURFACE_AREA;
	//정적 블록에서 상수 초기화 (초기화 방법2. 위에서 선언만 해두고 static 블록에서 값 초기화) 
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}

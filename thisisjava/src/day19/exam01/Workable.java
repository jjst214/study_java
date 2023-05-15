package day19.exam01;

//@FunctionalInterface 컴파일 과정에서 추상 메소드가 한개뿐인지 검사를 하도록 함
//정확한 함수형 인터페이스를 작성하도록 도와줌
@FunctionalInterface
public interface Workable {
	void work();
}

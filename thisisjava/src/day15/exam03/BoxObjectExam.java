package day15.exam03;

public class BoxObjectExam {

	public static void main(String[] args) {
		//타입파라미터는 기본적으로 Object 타입으로 간주
		//Object클래스가 가지고 있는 equals() 메소드를 호출함
		BoxObject box1 = new BoxObject();
		box1.content = "100";
		
		BoxObject box2 = new BoxObject();
		box2.content = 200;
		
		BoxObject box3 = new BoxObject();
		box3.content = 200;
		
		boolean result1 = box1.compare(box2);
		System.out.println(result1);
		
		boolean result2 = box2.compare(box3);
		System.out.println(result2);
	}

}

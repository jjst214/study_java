package day15.exam01;

public class GetResourceExam {

	public static void main(String[] args) {
		Class clazz = Car.class;
		//getPath() url객체의 메소드로 절대경로를 리턴
		String img1Path = clazz.getResource("dog.jpeg").getPath();
		String img2Path = clazz.getResource("images/dog2.jpg").getPath();
		
		System.out.println(img1Path);
		System.out.println(img2Path);
	}

}

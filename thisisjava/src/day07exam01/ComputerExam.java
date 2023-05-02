package day07exam01;

public class ComputerExam {

	public static void main(String[] args) {
		Computer com = new Computer();
		
		System.out.println(com.sum(10,30,40,20,5));
		
		int[] nums = {1,2,3,4,5};
		int result = com.sum(nums);
		System.out.println(result);
		
		System.out.println(com.add(3.25, 2));
		System.out.println(com.areaRectangle(10,4.5));
	}

}

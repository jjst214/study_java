package brushup;

public class ComputerExample {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		int result1 = c1.sum(new int[] {1,2,3,4,5,6});
		int[] arr = {1,2,3,4,5,6};
		int result2 = c1.sum(arr);
		
		int result3 = c1.sum2(1,2,3,4,5);
		int result4 = c1.sum2(arr);
		int result5 = c1.sum2(new int[] {1,2,3,4});
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}

}

package day05.exam01;

public class ArrayCopyExam {

	public static void main(String[] args) {
		int[] oldIntArray = {10,20,30};
		int[] newIntArray = new int[3];
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		int[] newIntArray2 = oldIntArray;
		oldIntArray[0] = 100;
		for(int i=0; i<newIntArray2.length; i++) {
			System.out.println(newIntArray2[i]);
		}
		
		System.out.println("----------------------------------------");
		String[] oldstrArray = {"java", "array", "copy"};
		String[] newstrArray1 = oldstrArray;
		oldstrArray[2] = "copycopy";
		System.out.println(newstrArray1[2]);
		String[] newstrArray2 = new String[5];
		for(int i=0; i<oldstrArray.length; i++) {
			newstrArray2[i] = oldstrArray[i];
		}
		for(int i=0; i<newstrArray2.length; i++) {
			System.out.println(newstrArray2[i]);
		}
		
		System.out.println("----------------------------------------");
		int[] oldNums = {10,20,30};
		int[] newNums = new int[5];
		// 이 방법이 매우 편함
		System.arraycopy(oldNums, 0, newNums, 0, 3); // (복사해올 배열, 복사시작할 시작 인덱스, 붙여넣기 할 배열, 붙여넣기 할 시작 인덱스, 카피 할 갯수)
		for(int i=0; i<newNums.length; i++) {
			System.out.println(newNums[i]);
		}
		
		System.out.println("----------------------------------------");
		int[] nums = {1,2,3,4,5};
		for(int i:nums) {
			System.out.println(i);
		}
		
		int[] scores = {95,71,84,93,87};
		int sum = 0;
		for(int i:scores) {
			sum+=i;
		}
		System.out.println(sum);
		
	}

}
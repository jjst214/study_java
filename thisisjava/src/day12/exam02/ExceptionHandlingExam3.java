package day12.exam02;

public class ExceptionHandlingExam3 {
	public static void main(String[] args) {
		//배열의 길이는 2, 마지막 index 1
		String[] array = {"100", "1oo"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]" + value);
			}catch(Exception e){
				System.out.println("숫자로 변환 할 수 없음 : " + e.getMessage());
			}
		}
		
		System.out.println("프로그램");
	}
}

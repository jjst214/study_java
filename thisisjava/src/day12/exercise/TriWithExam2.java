package day12.exercise;

public class TriWithExam2 {
	public static void main(String[] args) {
		
		MyResources res1 = new MyResources("res1");
		MyResources res2 = new MyResources("res2");
		try(res1; res2){
			
			System.out.println(Integer.parseInt(res1.read2()));
			System.out.println(Integer.parseInt(res2.read2()));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

package day12.exercise;

public class FileWriterExam {

	public static void main(String[] args) throws Exception {
		MyResources res1 = null;
		
		try {
			//리소스 열기
			res1 = new MyResources("res1");
			//리소스 읽기
			System.out.println(Integer.parseInt(res1.read1()));
			System.out.println(Integer.parseInt(res1.read2()));
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			res1.close();
		}
		
	}

}

//파일 자동닫기를 하려면 AutoCloseable() 인터페이스를 구현해야함
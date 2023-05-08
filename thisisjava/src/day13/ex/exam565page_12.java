package day13.ex;

public class exam565page_12 {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3.equals(obj4)); //128이상의 값은 다른객체로 생성 되기에 equals로 값만 비교해야 true가 나옴
		
		
	}

}

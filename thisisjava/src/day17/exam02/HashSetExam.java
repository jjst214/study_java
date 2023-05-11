package day17.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		//객체저장
		set.add("java");
		set.add("jdbc");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("aaa");
		
		//저장된 객체 수
		int size = set.size();
		System.out.println(size); // HashSet은 객체간 hashcode 비교를 통해 중복된 값을 가진 객체는 저장하지 않음
		for(String str: set) {
			System.out.println(str);
		}
		
		Set<Member> set2 = new HashSet<>();
		//멤버객체저장
		set2.add(new Member("김그린", 30));
		set2.add(new Member("김그린", 30));
		
		//저장된 객체 수
		int size2 = set2.size();
		System.out.println(size2);
	}

}

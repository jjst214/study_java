package day17.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		//ArrayList 생성법1
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JBDC");
		list.add("Servlet");
		list.add(1, "green");
		
		//get(index) 해당 인덱스 객체 반환
		//contains(E) 주어진 객체가 있는지 반환(true,false)
		//remove(E) 해당 객체 제거
		//remove(index) 해당 인덱스의 객체 제거
		//clear() 객체 전부 제거(비우기)
		//isEmpty() 객체가 전부 비어있는지 true false 반환
		
		int listSize = list.size();
		
		System.out.println(list.get(1));
		System.out.println("총 갯수 : " + listSize);
		boolean result = list.contains("java");
		boolean result2 = list.contains("abc");
		
		System.out.println(result);
		System.out.println(result2);
		list.clear();
		System.out.println(list.isEmpty());
		
		
		//ArrayList 생성법2
		List list2 = new ArrayList<>();
		System.out.println(list2.size());
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("5");
		System.out.println(list2);
		
		for(int i=list2.size()-1; i>=0; i--) {
			list2.remove(i);
			System.out.println(list2);
		}
		
		
	}

}

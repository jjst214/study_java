package day17.exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		//ArrayList 객체 생성
		List<String> list1 = new ArrayList<String>();
		//LinkedList 객체 생성
		List<String> list2 = new LinkedList<String>();
		
		//작업 시간 계산
		long start;
		long end;
		
		start = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		end = System.nanoTime();
		System.out.println("ArrayList 작업 소요시간 : " + (end-start));
		
		start = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		end = System.nanoTime();
		System.out.println("LinkedList 작업 소요시간 : " + (end-start));
		
	}

}

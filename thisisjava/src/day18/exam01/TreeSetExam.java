package day18.exam01;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		//TreeSet 컬렉션 생성하기 Set인터페이스 구현
		TreeSet<Integer> treeset = new TreeSet<>();
		
		treeset.add(10);
		treeset.add(7);
		treeset.add(12);
		treeset.add(5);
		treeset.add(19);
		treeset.add(1);
		
		//자동적으로 오름차순 정렬되어 값이 저장된다
		System.out.println(treeset);
		
		Integer firstNum = treeset.first();
		Integer lastNum = treeset.last();
		System.out.println(firstNum);
		System.out.println(lastNum);
		Integer lowerNum = treeset.lower(7);
		System.out.println("7보다 작은 숫자 : " + lowerNum);
		Integer highNum = treeset.higher(10);
		System.out.println("10보다 높은 숫자 : " + highNum);
		Integer floorNum = treeset.floor(9);
		System.out.println(floorNum);
		
		//decendingIterator() 내림차순 반복자 리턴
		Iterator<Integer> iterator = treeset.descendingIterator();
		while(iterator.hasNext()) {
			int a = iterator.next();
			System.out.println(a);
		}
		
		//decendingSet() 내림차순 set을 리턴
		NavigableSet<Integer> treeset2 = treeset.descendingSet();
		System.out.println(treeset2);
		//headSet 주어진 값보다 이하,미만의 수 오름차순 출력
		NavigableSet<Integer> treeset3 = treeset.headSet(11, true); //true=10'이하' 수, false=10'미만' 수
		System.out.println(treeset3);
		
		NavigableSet<Integer> treeset4 = treeset.subSet(10, true, 15, false); //true'이상/이하', false'초과/미만'
		System.out.println(treeset4);
	}

}

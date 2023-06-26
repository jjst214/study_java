package java01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreesetExam {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		//객체 저장
		treeSet.add(80);
		treeSet.add(10);
		treeSet.add(40);
		treeSet.add(45);
		treeSet.add(41);
		treeSet.add(75);
		treeSet.add(86);
		treeSet.add(97);
		
		System.out.println(treeSet);
		
		Integer firstNum = treeSet.first();
		Integer lastNum = treeSet.last();
		System.out.println("가장 작은 수는 : " + firstNum);
		System.out.println("가장 큰 수는 : " + lastNum);
		
		//미만 false, 이하 true
		NavigableSet<Integer> rangeSet = treeSet.headSet(30, false);
		NavigableSet<Integer> rangeSet2 = treeSet.tailSet(36, false);
		System.out.println(rangeSet);
		System.out.println(rangeSet2);
		NavigableSet<Integer> rangeSet3 = treeSet.subSet(20, false, 50, false);
		System.out.println(rangeSet3);
	}

}

package day18.exam01;

import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;

public class TreeMapExam {

	public static void main(String[] args) {
		//TreeMap 컬렉션 생성
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		//엔트리 저장 (자동으로 오름차순 정렬, 정렬기준:key(왼쪽)값)
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("descripton", 20);
		treeMap.put("ever", 30);
		treeMap.put("odd", 15);
		
		//Map 반복
		//반복문에 넣을수 있게 set으로 변환하는 방법1
//		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
//		for(Entry<String, Integer> entry: entrySet) {
//			
//		}
		//반복문에 넣을수 있게 set으로 변환하는 방법2
		for(Entry<String, Integer> entry: treeMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		//특정 키에 대한 값 가져오기
		Entry<String, Integer> reEntry = null;
		//첫번째 값
		reEntry = treeMap.firstEntry();
		System.out.println(reEntry.getKey() + " , " + reEntry.getValue());
		//마지막 값
		reEntry = treeMap.lastEntry();
		System.out.println(reEntry.getKey() + " , " + reEntry.getValue());
		//기준보다 앞단어
		reEntry = treeMap.lowerEntry("green");
		System.out.println(reEntry.getKey() + " , " + reEntry.getValue());
		//기준보다 뒤단어
		reEntry = treeMap.higherEntry("green");
		System.out.println(reEntry.getKey() + " , " + reEntry.getValue());
		
		//내림차순 정렬하기
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		//Map->Set
		Set<Entry<String, Integer>> descendingSet = descendingMap.entrySet();
		
		for(Entry<String, Integer> e:descendingSet) {
			System.out.println(e); //알파벳순(키값) 내림차순 출력
		}
		
		//범위 검색
		System.out.println("[c~j사이의 단어 검색]");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "j", true); //c,j를 포함한 c~j의 키값을 가진 객체
		for(Entry<String, Integer> e: rangeMap.entrySet()) {
			System.out.println(e.getKey() + " * " + e.getValue());
		}
	}

}

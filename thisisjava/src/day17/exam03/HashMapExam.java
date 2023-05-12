package day17.exam03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		//객체 생성
		map.put("김그린", 30);
		map.put("홍길동", 36);
		map.put("이블루", 28);
		map.put("이재라", 32);
		map.put("김노랑", 22);
		
		//키로 값 얻기
		int value = map.get("김그린");
		System.out.println(value);
		
		int size = map.size();
		System.out.println(size);
		
		//키로 entry삭제
		map.remove("김그린");
		int size2 = map.size();
		System.out.println(size2);
		boolean re = map.containsKey("김노랑");
		System.out.println("김노랑 키는 : " + re);
		boolean re2 = map.containsValue(22);
		System.out.println(re2);
		
		//키 set컬렉션으로 얻고 반복하기
		Set<String> keySet = map.keySet();
		
		//반복자 얻기
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + " " + v);
		}
		
		//entry를 set 컬렉션으로 반환(map타입-->set타입)
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Entry<String,Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " " + v);
		}
		
		map.clear();	//map에 있는 entry제거
		System.out.println(map.isEmpty());	//비어있으면true !false
	}

}

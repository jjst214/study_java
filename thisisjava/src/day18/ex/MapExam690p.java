package day18.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam690p {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Entry<String, Integer>> set = map.entrySet();
		for(Entry<String, Integer> entry: set) {
			if(entry.getValue()>maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
			totalScore += entry.getValue();
		}
		System.out.println("평균 점수: " + (totalScore / set.size()));
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 점수를 받은 아이디: " + name);
		
	}

}

package day18.exam01;

import java.util.TreeSet;

public class FruitComparaExam {

	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<>();
		
		treeSet.add(new Fruit("포도", 5000));
		treeSet.add(new Fruit("수박", 8000));
		treeSet.add(new Fruit("딸기", 10000));
		
		for(Fruit f:treeSet) {
			System.out.println(f.name + " " + f.price);
		}
	}

}

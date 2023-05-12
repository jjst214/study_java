package day18.exam01;

import java.util.TreeSet;

public class PersonTreeSetExam {

	public static void main(String[] args) {
		//정렬이 되러면 Comparable 인터페이스를 구현해야함
		TreeSet<Person> treeset = new TreeSet<>(new PersonComparator());
		treeset.add(new Person("김그린", 30));
		treeset.add(new Person("이그린", 20));
		treeset.add(new Person("박그린", 10));
		for(Person p:treeset) {
			System.out.println(p.name + " , " + p.age);
		}
	}

}

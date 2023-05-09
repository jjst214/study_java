package day15.exam03;

import day06.exam02.Tv;
import day10.exam05.Car;

public class ProductGendericExam {

	public static void main(String[] args) {
		//K는 Tv타입, M은 String 타입
		Product<Tv, String> product1 = new Product<>();
		
		//Setter
		product1.setKind(new Tv());
		product1.setModel("스마트tv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//K는 Car, M은 String
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("suv자동차");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}

}

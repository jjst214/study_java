package day09.exam02;

public class AnimalExam {

	public static void main(String[] args) {
		Animal aniCat = new Cat();
		Animal aniDog = new Dog();
		
		aniCat.sound();
		aniDog.sound();
		typeChange(aniDog);
		typeChange(aniCat);
	}
	public static void typeChange(Animal ani) {
		if(ani instanceof Dog) {
			Dog dog = (Dog) ani;
		}
	}

}

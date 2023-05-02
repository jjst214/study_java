package day09.exam06;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		animalSound(cat);
		animalSound(new Dog());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}

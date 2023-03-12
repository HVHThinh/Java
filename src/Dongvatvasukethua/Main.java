package Dongvatvasukethua;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Lulu", 2, "Alaska", "White", 40.5);
		Cat cat = new Cat("Huda", 1, "Rusian Blue", "Gray", 30.6);
		
		System.out.println("Dog: " + dog.getName() + " - " + dog.getAge() + " years old - " + dog.getType() + " - " + dog.getMauSac() + " - " + dog.getWeight() + "kg");
        System.out.println("Cat: " + cat.getName() + " - " + cat.getAge() + " years old - " + cat.getType() + " - " + cat.getMauLong() + " - " + cat.getHeight() + "cm");
	}

}

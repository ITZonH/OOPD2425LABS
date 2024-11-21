package lab7;
//Hamed Zon
//C00259228

public class AnimalsTest
{
	public static void main (String args[])
	{
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();

		System.out.println();

		Vet vet = new Vet("Ben");
		vet.vaccianate(cat);
		Vet vet1 = new Vet("Ben");
		vet1.vaccianate(dog);
		
		}
}
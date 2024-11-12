package lab7;
//Hamed Zon
//C00259228
public class Dog extends Animal
{

    public Dog(String animalName, int animalAge ,char animalGender)
    {
        super(animalName, animalAge, animalGender);
    }

    public void sleep()
    {
        System.out.println("Dog's Sleeping");
    }

    public void eat()
    {
        System.out.println("Dog's Eating");
    }

    public void makeSound()
    {
        System.out.println("Dog's Barking");
    }
    

}

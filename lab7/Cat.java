package lab7;
//Hamed Zon
//C00259228
public class Cat extends Animal
{

    public Cat(String animalName, int animalAge, char animalGender)
    {
        super(animalName, animalAge, animalGender);
    }

    public void sleep()
    {
        System.out.println("Cat's Sleeping");
    }

    public void eat()
    {
        System.out.println("Cat's Eating");
    }

    public void makeSound()
    {
        System.out.println("Cat's meoooowooo");
    }
    

}

package lab7;

public class Animal 
{
    private String animalName;
    private char animalGender;
    private int animalAge;

    public Animal()
    {
        
    }
    
    public Animal(String animalName, int animalAge, char animalGender)
    {
        this.animalName = animalName;
        this.animalGender = animalGender;
        this.animalAge = animalAge;
       
    }
    
    public void setAnimalName(String animalName)
    {
        this.animalName = animalName;
    }

    public void setAnimalGender(char animalGender)
    {
        this.animalGender = animalGender;
    }

    public void setAnimalAge(int animalAge)
    {
        this.animalAge = animalAge;
    }

    public String getAnimalName()
    {
        return animalName;
    }
    public char getAnimalGender()
    {
        return animalGender;
    }
    public int getAnimalAge()
    {
        return animalAge;
    }

    public void sleep()
    {
        System.out.println();
    }

    public void eat()
    {
        System.out.println();
    }

    public void makeSound()
    {
        System.out.println();
    }
    

    public String toString()
    {
        String animalInfos = "";
        animalInfos += "This Animal's Name's : " + animalName + "\nThe Gender's: " + animalGender + "\nThe Age is: " + animalAge;
        return animalInfos;
    }
}

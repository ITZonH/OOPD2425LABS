package lab7;
//Hamed Zon
//C00259228
public class Vet 
{
    private String vetName;

    public Vet()
    {
        
    }

    public Vet(String vetName)
    {
        this.vetName = vetName;
    }

    public void setVetName(String vetName)
    {
        this.vetName = vetName;
    }
    public String getVetNeme()
    {
        return vetName;
    } 

    public void vaccianate(Animal animal)
    {
        if( animal instanceof Dog)
            {
                System.out.println("vat's vaccinating the Dog");
            }
        else if( animal instanceof Cat)
            {
                System.out.println("vat's vaccinating the Cat");
            }
            

    }
    
}

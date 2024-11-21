package lab8;
//Hamed Zon
//C00259228
public abstract class Person
{
    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        String theName = "Name is: " + name;
        return theName;
    }
    public abstract  String getDescription();
}
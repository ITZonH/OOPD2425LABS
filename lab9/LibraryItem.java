package lab9;
//C00259228
//Hamed Zon
//Interface 
public abstract class LibraryItem implements LoanItem
{
    private String id;
    private String type;
    

    public LibraryItem(String type, String id)
    {
        this.type = type;
        this.id = id;
    }
    public void settype(String type)
    {
        this.type = type;
    }

    public void setId(String id)
    {
        this.id = id;
    }
    public String gettype()
    {
        return type;
    }
    public String getId()
    {
        return id;
    }

    public String toString()
    {
        String details = "";
        details += "Type is: " + type + "\nId is: " + id;
        return details;
    }
    
   
}
package lab9;

public class arrayLItem
{
    public static void main(String[] args) 
    { 
       LibraryItem [] library= new LibraryItem[3];
       library[0] = new Book("Book", "C000002", "Hamed", "love", 100);
       library[1] = new CD("MOVIE","T4456", "ONE DIRECTION", "Sun", 12);
       
       System.out.println(library[0].toString());
       System.out.println("\n"+ library[1].toString());
       System.out.println("\n"+library[0].calculatePrice());
       System.out.println("\n"+library[1].calculatePrice());
       
    }

}
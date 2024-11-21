package lab9;
//C00259228
//Hamed Zon 
//SubClass
public class Book extends LibraryItem 
{
    private int numPages;
    private String author;
    private String title;
    public Book(String type, String id, String author, String title, int numPages)
    {
        super(type,id);
        this.numPages = numPages;
        this.author = author;
        this.title = title;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setNumPage(int numPages)
    {
        this.numPages = numPages;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public int getNumPages()
    {
        return numPages;
    }

    public String toString()
    {
        String BookInfo = "Book Author is: " + author + "\nTitle: " + title + "\nNumber of pages is: " + numPages +
        "\n" + super.toString();
        return BookInfo;
    }

    public double calculatePrice()
    {
        return BOOKPRICE *numPages;
    }
}
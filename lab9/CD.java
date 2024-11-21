package lab9;
//C00259228
//Hamed Zon 
//SubClass

public class CD extends LibraryItem 
{
    private String band;
    private String title;
    private int numTracks;
    public CD(String type, String id, String band, String title, int numTracks)
    {
        super(type,id);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    public void setBand(String band)
    {
        this.band = band;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setNumbTracks(int numTracks)
    {
        this.numTracks = numTracks;
    }

    public String getBand()
    {
        return band;
    }
    public String getTitle()
    {
        return title;
    }
    public int getNumTracks()
    {
        return numTracks;
    }

    public String toString()
    {
        String  CDinfo = "Band Name: " + band + "\nTitle: " + title + "\nnumber of Tracks: " + numTracks 
        + "\n" + super.toString();
        return CDinfo;
    }
    public double calculatePrice()
    {
        return CDPRICE*numTracks;
    }
}
//Hamed Zon
//C00259228
// HotelRoom 
public class HotelRoom
{
    private int roomNtmber;
    private String roomType;
    private int occupied;
    private double rate;
    

    public HotelRoom()
    {

    }
    public HotelRoom(int theRoomNumber, String theRoomType, int theOccupied, double rate)
    {
        roomNtmber =  theRoomNumber;
        roomType = theRoomType;
        occupied = theOccupied;
    }

    public void setTheRoomNumber(int theRoomNumber)
    {
        roomNtmber = theRoomNumber;

    }
    public void setTheRommType(String theRoomType)
    {
        roomType = theRoomType;
    }

    public void setTheOccupied(int theOccupied)
    {
        occupied = theOccupied;
    }
    public void setTheRate(double setTheRate)
    {
        rate = setTheRate;
    }

    public int getTheRoomNumber()
    {
        return roomNtmber;
    }

    public String getTheRoomType()
    {
        return roomType;
    }

    public int getTheoccupied()
    {
        return occupied;
    }

    public double getTheRate()
    {
        return rate;
    }
    

}
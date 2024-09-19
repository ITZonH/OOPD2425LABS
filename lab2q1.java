
public class lab2q1 
{
    public static void main(String[] args) 
    {
        HotelRoom roomA =  new HotelRoom();
        HotelRoom roomB = new HotelRoom();
        

        
        roomA.setTheRoomNumber(200);
        roomB.setTheRoomNumber(201);
        roomA.setTheRommType("Single");
        roomB.setTheRommType("Double");

        System.out.println("Room A Number is " + roomA.getTheRoomNumber() + "\n Room A Type is " + roomA.getTheRoomType());

        System.out.println("Room B Number is " + roomB.getTheRoomNumber() + "\n Room B Type is " + roomB.getTheRoomType());


        

        

        
    }

    
}

public class lab2q2 
{
    public static void main(String[] args) 
    {
        HotelRoom roomA =  new HotelRoom();
        HotelRoom roomB = new HotelRoom();
        
    
        

        
        roomA.setTheRoomNumber(200);
        roomB.setTheRoomNumber(201);
        roomA.setTheRommType("Single");
        roomB.setTheRommType("Double");
        roomA.setTheOccupied(1);
        roomB.setTheOccupied(0);
        roomA.setTheRate(100);
        roomB.setTheRate(80);

        System.out.println("Room A Number is " + roomA.getTheRoomNumber() + "\nRoom A Type is " + roomA.getTheRoomType() + "\nRoom A Status is " + roomA.getTheoccupied() + "\nRoom A rate over night is " + roomA.getTheRate());

        System.out.println("Room B Number is " + roomB.getTheRoomNumber() + "\nRoom B Type is " + roomB.getTheRoomType() + "\nRoom B Status is " + roomB.getTheoccupied() + "\nRoom B rate over night is " + roomB.getTheRate());


        

        

        
    }

    
}


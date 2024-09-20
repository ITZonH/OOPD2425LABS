public class lab2q4 
{
    public static void main(String[] args) 
        {
          
            HotelRoom roomB = new HotelRoom();
            roomB.setTheRoomNumber(2900);
            roomB.setTheRommType("single");
            roomB.setTheOccupied(1);
            roomB.setTheRate(80);
           
            if(roomB.isOccupied())
                {
                     System.out.println("Room B Number is " + roomB.getTheRoomNumber() + "\nRoom B Type is " + roomB.getTheRoomType() + "\nRoom B Status is " + roomB.isOccupied() + "\nRoom B rate over night is " + roomB.getTheRate());
                    

                }
            else if(!roomB.isOccupied())
                {
                     System.out.println("Room B Number is " + roomB.getTheRoomNumber() + "\nRoom B Type is " + roomB.getTheRoomType() + "\nRoom B Status is " + roomB.isOccupied() + "\nRoom B rate over night is " + roomB.getTheRate());

                }
           

           
           


            

            

            
        }

    
}

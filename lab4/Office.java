package lab4;
//ID: C00259228
//Name: Hamed Zon 
//This is the Offices Class


public class Office 
{
    private static int roomNum=100;
    private int roomId;
    private static int max=2;
    private Employee[] staffPerOffice = new Employee[max];
    private int addOfficeIndex;
    

    public Office()
    {
       roomId = roomNum;
       roomNum++;

    }

    public int getRoomNumber()
    {
        return roomId;
    }

    public String addOfficeEmployee(Employee theAddOffice)
    {
        if(addOfficeIndex<max)
            {
                staffPerOffice[addOfficeIndex] = theAddOffice;
                addOfficeIndex++; 
                return "You have: " + addOfficeIndex + "  in the Office you can add " + (max-addOfficeIndex) + " more!!!";
            }
        else
            {
                return "You have readched the max of people in the office: " + addOfficeIndex + " no office space available!!";
            }
        
        
    }

    public String toString()
    {
        String officeData ="";
        officeData += "Room ID: " + getRoomNumber();
         return officeData; 
         

    }
   
    
}

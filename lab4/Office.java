package lab4;
//ID: C00259228
//Name: Hamed Zon 
//This is the Offices Class


public class Office 
{
    private static int roomNum=100;
    private int roomId;
    private static final int MAX=2;
    private Employee[] staffPerOffice = new Employee[MAX];
    private int addOfficeIndex=0;
    
    

    public Office()
    {
       roomId = roomNum;
       roomNum++;

    }

    public int getOfficeIndex()
    {
        return addOfficeIndex;

    }

    public int getRoomNumber()
    {
        return roomId;
    }

    public String addOfficeEmployee(Employee theAddOffice)
    {
        if(addOfficeIndex<MAX)
            {
                staffPerOffice[addOfficeIndex] = theAddOffice;
                addOfficeIndex++; 
                return "You have: " + addOfficeIndex + "  in the Office you can add " + (MAX-addOfficeIndex) + " more!!!";
            }
        else
            {
                return "You have readched the max of people in the office: " + addOfficeIndex + " no office space available!!";
            }
        
        
    }

    public String toString()
    {
        String officeData ="";
        officeData += "In Office: " + getRoomNumber() + " we have: " + addOfficeIndex;
        for(Employee e: staffPerOffice)
            {

                if(e !=null)
                    {
                        officeData += "\nEmployee's informations: " + "\n" + e.toString();
                        
                    }
               
                
            }
       
       

         return officeData; 
         

    }
   
    
}

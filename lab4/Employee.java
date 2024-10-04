//ID C00259228
//Named Hamed Zon
package lab4;
public class Employee 
{
    private Address address;
    private String firstName;
    private String  lastName;
    private String employeeType;
    private String carInfos;
    private static int employeeNumber =1000;
    private int employeeId;

    public Employee()
    {
        

    }
    
    
    public Employee(String theFirstName,String theLastName)
    {
        
        firstName = theFirstName;
        lastName = theLastName;
        employeeId = employeeNumber;
        employeeNumber++;

    }

    public void setNewAddress(Address theAddress)
    {
        address = theAddress;
    }

    public void setFirtName(String theFirstName)
    {
        firstName = theFirstName;
    }

    public void setLastName(String theLastName)
    {
        lastName = theLastName;
    }

    public void  setEmployeeType(String theEmployeeType)
    {
        employeeType = theEmployeeType;
    }

    public void setCarInfos(String theCarInfos)
    {
        carInfos = theCarInfos;
    }


    public Address getNewAddress()
    {
        return address;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    public String getEmployeeType()
    {
        return employeeType;
    }

    public String getCarInfos()
    {
        return carInfos;
    }
    public int getEmployeeId()
    {
        return employeeId;
    }
   
        
            public String toString()
            {
                String employesInfos ="";
                if(employeeType.equalsIgnoreCase("staff"))
                    {
                        employesInfos +=  "First Name: " + getFirstName(); 
                        employesInfos += "\nLast Name: " + getLastName();
                        employesInfos += "\nEmployee's Id: " + getEmployeeId();
                        employesInfos += "\nEmployee's Satus: " + getEmployeeType();
                        employesInfos += "\nEmployee's Address: " + getNewAddress();
                        return employesInfos;
                    
                    }
                    
                
                else if(employeeType.equalsIgnoreCase("manager"))
                    {
                        employesInfos +=  "First Name: " + getFirstName(); 
                        employesInfos += "\nLast Name: " + getLastName();
                        employesInfos += "\nEmployee's Id: " + getEmployeeId();
                        employesInfos += "\nEmployee's Satus: " + getEmployeeType();
                        employesInfos += "\nCar Infos: " + getCarInfos();
                        employesInfos += "\nEmployee's Address: " + getNewAddress();
                        
                        return employesInfos;
                    }
                    else 
                        {
                            return "Not valid";
                        }
                        

            }
            
        
}

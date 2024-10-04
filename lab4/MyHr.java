package lab4;
//ID C00259228
//NAME Hamed Zon
//This driver programme allows sellect options,to create, list, look at offices, and print all employees
import java.util.Scanner;

public class MyHr 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Office[] offices = new Office[3];
        Office office;
        Employee[] newEmployees = new Employee[5];
        Employee newEmployee;
        String employeeFirstName;
        String employeeLastName;
        String employeeStatus;
        String carInfos = null;
        String city;
        String county;
        String street;
        int count=0;
        int option=0;
        int index;

        //int employeeIndex;

        for(index =0; index < offices.length;index++)
            {
                office = new Office();
                offices[index]= office;
            }

           

        while(option !=4)
        {
            System.out.println("Option: 1 to list all Offices");
            System.out.println("Option: 2 to create new employee record");
            System.out.println("Option: 3 to list all employees");
            System.out.println("Option: 4 to Exit");

            System.out.println("----------------------------------------------------");
            
            option = in.nextInt();
            in.nextLine();
            switch(option) 
            {
                case 1:
                for(index =0; index < offices.length;index++)
                {
                    System.out.println(offices[index].toString());
                    System.out.println("---------------------------------------");
                }
                
                break;
                    

                case 2:
                    if(count< newEmployees.length)
                        {

                            System.out.println("Are you Staff or Manager");   
                            employeeStatus = in.nextLine();

                            System.out.println("Enter Employee's First Name");  
                            employeeFirstName = in.nextLine();
                        
                            System.out.println("Enter Employee's Last Name");
                            employeeLastName = in.nextLine();
                        
                                                        
                            System.out.println("Enter Employee's Address");
                        
                            System.out.println("Enter City");
                            city = in.nextLine();
                            System.out.println("Enter Street");
                            street = in.nextLine();
                            System.out.println("Enter County");
                            county = in.nextLine();
                            
                            
                        
                            if(employeeStatus.equalsIgnoreCase("staff"))   
                                {
                                   
                                    Address address = new Address(city,street,county);
                                    newEmployee = new Employee(employeeFirstName,employeeLastName);
                                    newEmployee.setNewAddress(address);
                                    newEmployee.setEmployeeType(employeeStatus);
                                    newEmployees[index] = newEmployee;

                                   
                                    
                                 
                                    

                                }  
                            else if(employeeStatus.equalsIgnoreCase("manager"))  
                                {
                                    System.out.println("Enter Car Infos ");
                                    carInfos = in.nextLine();
                                    Address address = new Address(city,street,county);
                                    newEmployee = new Employee(employeeFirstName,employeeLastName);
                                    newEmployee.setNewAddress(address);
                                    newEmployee.setCarInfos(carInfos);
                                    newEmployee.setEmployeeType(employeeStatus);
                                    newEmployees[index] = newEmployee;

                                }

                            else
                                {
                                    System.out.println("Invalide Employee Status. Please Are You Manager or Staff ");
                                    break;
                                }
                                                
                                count++;
                                System.out.println("-----------------------------------");
                                System.out.println("Employee Successfully Added Employee " + count );
                                
                        }
                    else
                        {
                            System.out.println("no space");
                            
                        }
                        break;
                case 3:
                        {
                            for(index = 0; index <newEmployees.length; index++)
                                {
                                    if(newEmployees[index]!=null)
                                        {
                                            System.out.println(newEmployees[index].toString() );
                                            System.out.println("-------------------------------------");
                                        }
                                    else if(newEmployees[index]==null)
                                        {
                                            System.out.println("You have " + count + " Employee(s).");
                                            System.out.println("-------------------------------------------");
                                            break;
                                        }
                                }
                        }
                        break;
                case 4:
                    {
                        System.out.println("You have EXIT This Programme");
                    }
            default:
                break;
            }//end switch 
        }//end while loop
        
        in.close();  
    } 
}
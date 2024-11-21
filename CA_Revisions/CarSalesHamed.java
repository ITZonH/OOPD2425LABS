package CA_Revisions;

import java.util.Scanner;


public class CarSalesHamed 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Car [] car = new Car[10];
        Car cars;
        DealerShip[] dealerShips = new DealerShip[5];
        DealerShip dealerShip;
        Address address;
        String carType;
       // String electric;
        String electricType ="";
        double engineSize;
        double price;
        String make;
        String model;
        String dealerName;
        String city;
        String street;
        String county;
        int index;
        int carIndex=0;
        int dealerIndex=0;
        int option =0;
        int count=0;

       

        for(index=0;index<dealerShips.length;index++)
            {
                dealerShip = new DealerShip();
                dealerShips[index] = dealerShip;
            }

        while (option !=4) 
        {
            System.out.println("\t \t \t \t \tPlease Select An Option Of Your Choise To Complete Your Goal!!");
            System.out.println();

            System.out.println("Select Option 1 To View All DealerShips");
            System.out.println("Select Option 2 To Add New Car In Your DealerShip");
            System.out.println("Select Option 3 To View All Cars");
            System.out.println("Select Option 4 To Exit");
            option = in.nextInt();
            in.nextLine();

            switch (option) 
            {
                case 1:
                    {
                        for(index=0;index<dealerShips.length;index++)
                            {
                                
                                System.out.print("Enter car DealerShip'Name: ");
                                dealerName = in.nextLine();
                                
                                System.out.print("Enter City: ");
                                city = in.next();
                                System.out.print("Enter Street: ");
                                street = in.next();
                                System.out.print("Enter County: ");
                                county = in.next();
                                dealerShip = new DealerShip(dealerName);
                                address = new Address(city,street,county);
                                dealerShips[index].setDealerAdd(address);
                                dealerShips[index].setDealerName(dealerName);

                                
                                System.out.println(dealerShips[index].toString());
                                

                            }
                    }
                    
                    break;
                case 2:
                    {
                        if(count<car.length)
                            {
                              
                                System.out.print("Enter Car Model: ");
                                model = in.nextLine();
                                System.out.print("Enter Car Make: ");
                                make = in.nextLine();
                              
                                System.out.print("Enter Car type: ");
                                carType = in.nextLine();
                               
                                System.out.print("Enter Car price: ");
                                price = in.nextDouble();


                                if(carType.equalsIgnoreCase("electric"))
                                    {
                                        System.out.println("Enter electric type");
                                        electricType = in.next();
                                        if(electricType.equalsIgnoreCase("Hybrid")|| 
                                        electricType.equalsIgnoreCase(" Plug-In Hybrid")
                                        || electricType.equalsIgnoreCase("Fully Electric"));
                                        {
                                            /* 
                                            if(carIndex<car.length)
                                                {
                                                    cars = new Car(electricType,price,model,make,carType);
                                                    car[carIndex]= cars;
                                                    carIndex++;
        

                                                }
                                            else
                                                {
                                                    System.out.println("You can't add car, no space");
                                                }
                                                    */
                                            
                                            if(dealerIndex<dealerShips.length)
                                                {
                                                    address = new Address(city,street,county);
                                                    dealerShips[dealerIndex].setDealerAdd(address);
                                                    dealerShips[dealerIndex].setDealerName(dealerName);
                                                    cars = new Car(electricType,price,model,make,carType);
                                                    dealerShips[dealerIndex].addCar(cars);

                                                    dealerIndex++;


                                                }
                                            else
                                                {
                                                    System.out.println("You can't add dealership, no space");
                                                }
                                           
                                        }

                                    }
                                else 
                                    {
                                        System.out.print("Enter Car Engine Size: ");
                                        engineSize = in.nextDouble();
                                        if(carIndex<car.length)
                                            {

                                                address = new Address(city,street,county);
                                                cars = new Car(electricType,price,model,make,carType);
                                                dealerShips[dealerIndex].addCar(cars);
                                                car[carIndex] = cars;
                                                carIndex++;
                                            }
                                               
                                      
                                        else
                                            {
                                                System.out.println("You can't add dealership, no space");
                                            }

                                    }
                                    count++;
                                
                            }
                    }
                    break;
                case 3:
                    {
                        
                                for(index=0;index<car.length;index++)
                                    {
                                        if(car[carIndex] !=null)
                                            {
                                                System.out.println(car[index].toString());
                                            }
                                        else
                                            {
                                                System.out.println("you have:" + carIndex  + " Car recods select 2 to create one");
                                                break;
                                            }   
                            
                                            

                                    }
                                
                            
                        
                            
                              

                        
                               

                            
                        
                    }
                    break;
            
                default:
                    break;
            }


            
        }



        
    }
    
}

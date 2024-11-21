package CA_Revisions;

public class Car 
{
    private static int carReg = 100;
    private int carRegistration = 0;
    private String  make;
    private String model;
    private double price;
    private double engineSize=0.0;
    private String carType;
    private String electricType = "N/A" ;
   

    public Car()
    {
      

    }

    public Car(String electricType,double price, String make, String model,String carType)
    {
        this.electricType = electricType;
        this.price=price;
        this.make=make;
        this.model=model;
        this.carType=carType;
        this.carRegistration=carReg;
        carReg++;
    }

    public Car(String make,String model,double price,double engineSize,String carType)
    {
        this.make = make;
        this.model = model;
        this.price = price;
        this.engineSize = engineSize;
        this.carType = carType;
        this.carRegistration = carReg;
        carReg++;
        
    }

    public void setCarType(String carType)
    {
        this.carType = carType;
    }

    public void setElectricType( String electricType)
    {
        this.electricType = electricType;
    }

   

    public String getMake()
    {
        return make;
    }

    
    public String getStringModel()
    {
        return model;
    }

    public double getPrice()
    {
        return price;
    }

    public double getEngineSize()
    {
        return engineSize;
    }

    public int getCarRegis()
    {
      return carRegistration;

    }

    public String getCarType()
    {
        return carType;
    }

    public String getElectricType()
    {
        return electricType;
    }

    public String toString()
    {
        String carDetails = "";
 
            carDetails += "Car Details: ";
            carDetails += "\nMake: " + make;
            carDetails += "\nModel: " + model;
            carDetails += "\nPrice: " + price;
            carDetails += "\nCar Type: " + carType;
            carDetails += "\n car reg: " + carRegistration;
            if (electricType != null)
                {
                    carDetails += "\nElectric Type: " + electricType + "\nCar Registration: " + carRegistration;

                }
            else
                {
                    carDetails += "\nEngine Size: " + engineSize + "\nCar Registration: " + carRegistration;
                    
                }
               

            return carDetails;

            
            

    }
    



    
}

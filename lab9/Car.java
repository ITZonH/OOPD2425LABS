package lab9;
//Hamed Zon
//C00259228
//Car class extends RoadVehicle
public class Car extends RoadVehicle
{
	private String carType;
 
	public Car() 
    {
	 	this("", 0, 0);
	}
 
	public Car(String c, int w, int p) 
    { 
		super(w, p);
		setType(c);
	}
 
	public void setType(String t)  
    {
		carType = t;
	}
 
	public String getType() 
    {
		return carType;
	}

	public double calculateDuty()
	{
		return CARTAXRATE*getWheels();
	}

    public String toString()
    {
        String carInfo = super.toString() + "\nCar Type is: " + carType;
        return carInfo;
    }
}


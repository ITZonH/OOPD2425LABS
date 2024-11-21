package lab8;
//Hamed Zon
//C00259228

public abstract class ThreeDShape extends Shape
{
	public ThreeDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
 
  	public abstract double volume();
	
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}
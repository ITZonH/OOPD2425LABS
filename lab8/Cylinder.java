package lab8;
//Hamed Zon
//C00259228

public class Cylinder extends ThreeDShape
{
    private double height;
    private double radius;

    public Cylinder(String name, String colour, double height, double radius)
    { 
        super(name, colour);
        this.height = height; 
        this.radius = radius;
        
    }

    public void setHeight(double height)
    { 
        this.height = height; 
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getHeight()
    { 
        return height;
    }
    public double getRadius()
    {
        return radius;
    }


    public double area()
    { 
        return 2 * Math.PI * getRadius() * height; 
    }
    public double volume() 
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    public String toString() 
    {		
        return (super.toString() + " Height : " + height);
	}
}
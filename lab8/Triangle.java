package lab8;
//Hamed Zon
//C00259228

public class Triangle extends TwoDShape
{
    private double height;
    private double base;

    public Triangle(String name, String colour, double height, double base)
    {
        super(name,colour);
        this.height = height;
        this.base = base;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getHeight()
    {
        return height;
    }

    public double getBase()
    {
        return base;
    }

    public double area()
    {
        return ((1/2)*(base*height));

    }

    public String toString()
    {
        String triangleInfos ="";
        triangleInfos = "The Height is :" + height + "\nThe Base is: " + base;
        triangleInfos +="\nArea Of The Triangle is: " + area();
        return triangleInfos;
    }

}
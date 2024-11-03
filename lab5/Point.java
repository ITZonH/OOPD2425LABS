package lab5;

public class Point 
{
    protected int x;
    protected int y;

    public Point()
    {

    }

    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX()
    {
        return x;
    }

    public int gety()
    {
        return y;
    }
    
    public String toString()
    {
        String result = "";
        result += "x = " + x;
        result += "\ny = " + y;
        return result;
    }


}

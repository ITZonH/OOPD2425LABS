
public class Rectangle 
{
    private int  length;
    private int width ;
    int i;
    int j;
    



    public Rectangle()
    {
        length = 1;
        width = 1;
      

    }

    public void setLength(int length)
    {
        
        if(length > (0.0) && length <= (40))

            {
                this.length=length;
            }
        else
            {
                this.length=length;
                System.out.println("Length is not 0.0 or 40.0");
            }
        
    }

    public void setWidth(int width)
    {
        if(width > (0.0) && width  <= (40.0))
            {
                this.width=width;;

            }
        else
            {
                this.width=width;
                System.out.println("Width is not 0.0 or 40.0");
            }
       
    }

    public int getLength()
    {
        return length;
        
    }

    public int getWidth()
    {
        return width;
    }

    public int getArea()
    {
        return length*width;
        
    }

    public int getPerimeter()
    {
        return 2*(length+width);
    }

    public void printRectangle()
    {
        
        for(i=0;i<length;i++)
            {
            for(j=0;j<width;j++)
                {
                    if(i==0 || i ==length-1)
                    {
                        System.out.print("*");

                    }
                else if(j==0 || j==width-1)
                    {
                        System.out.print("*");
                    }
                else 
                {
                    System.out.print(" ");
                }

                    

                }
                System.out.println();

                

            }

           
            
            
    }
        

    public String toString2()
    {
        return "Length = " + length + ", Width = "  + width + "\n Area = " + getArea() + ", perimeter = " + getPerimeter();
        
        

    }
    
    
}

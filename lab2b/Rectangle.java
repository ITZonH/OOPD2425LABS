//Hamed Zon
//C00259228
// this class calculates area,perimeter, width and length also print picture of rectangle.
public class Rectangle //class name
{
    private int  length;// this property are only accessible only in this class
    private int width ;
    int i; // variables for loops
    int j;
    



    public Rectangle() //constructor
    {
        length = 1; //initialized witha default values 1
        width = 1;
      

    }

    public void setLength(int length)// (allows user to enter or set the number they wish)method to set the action we want the code to perform when is call. the also allows us to access private properties.
    {
        
        if(length > (0.0) && length <= (40))//to check if length is greater than 0.0 and if length id less or equals 40

            {
                this.length=length;//set length or pass the value it
            }
        else
            {
                //incase the if part is false then this part will set the value and print below message
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

    public int getLength()// this method return the value of length when is call in the main
    {
        return length;
        
    }

    public int getWidth()
    {
        return width;
    }

    public int getArea()// this calculate the area and return it values when called
    {
        return length*width;
        
    }

    public int getPerimeter()// this calculate the perimeter and return it values when called
    {
        return 2*(length+width);
    }

    public void printRectangle()// this is a method to print when is call in the main
    {
        
        for(i=0;i<length;i++)//for loop to go through the inner loop one by one
            {
            for(j=0;j<width;j++)//this loop is ilitrate fully for each index position of the outter loop
                {
                    if(i==0 || i == length-1 || j==0 || j==width-1)//if the outter loo is 0 or if we in the last index we want to print stars each times in the same line or if inner loop is 0 or in the last index we want star
                        {
                            System.out.print("*"); //print stars
                        }

                
                    else 
                        {
                            System.out.print(" ");// if inner or outter loops index is not 0 or last index we want to print space
                        }

                    

                }
                System.out.println();//go to new line each time inner loop finished

                

            }

           
            
            
    }
        

    public String toString()//overwrite everything
    {
        return "Length = " + length + ", Width = "  + width + "\n Area = " + getArea() + ", perimeter = " + getPerimeter();
        
        

    }
    
    
}

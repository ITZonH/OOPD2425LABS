package lab5;
//Name Hamed Zon
//ID C00259228
// this code have a parent class and a subclass that ihrited point class
public class MyFirstCircle 
{ 
    public static void main (String args[]) 
    { 
        Point myPoint = new Point(10, 20); 
    
        Circle myCircle = new Circle(15, 30, 5);  
        System.out.println("Point details : " + myPoint); 
        System.out.println("Circle details: " + myCircle); 
    
    } 
}

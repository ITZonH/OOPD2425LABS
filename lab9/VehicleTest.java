package lab9;
//Hamed Zon
//C00259228
//Driver class to test all the classes

public class VehicleTest 
{
   public static void main(String[] args) 
   {
        RoadVehicle car = new Car("BMW", 4, 4);
        RoadVehicle hvg = new Hgv(7, 12, 3);
        System.out.println(car.toString());
        System.out.println("Tax is: "+ car.calculateDuty());

        System.out.println("\n"+hvg.toString());
        System.out.println("Tax is: "+ hvg.calculateDuty());
   } 
}

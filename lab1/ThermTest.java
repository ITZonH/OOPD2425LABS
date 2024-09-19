// Student Name 	: Hamed Zon
// Student Id Number: 
// Date 			: Sep-2024
// Purpose 			: My first class implementation

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		double t =2.0;
		double a =30.0;

        Thermometer thermB = new Thermometer(t);
		


		

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		System.out.println("temp. of thermometer B is " + thermB.getCelsius());
		thermB.setCelsius(a);
		System.out.println("Temp. of thermometer B is " + thermB.getCelsius());
	} // end main
} // end class ThermTest
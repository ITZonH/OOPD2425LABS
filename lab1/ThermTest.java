// Student Name 	: Hamed Zon
// Student Id Number: 
// Date 			: Sep-2024
// Purpose 			: My first class implementation

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		double t;
		

        Thermometer thermB = new Thermometer(10.0);

		t = thermB.getCelsius();
		


		

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		System.out.println("temp. of thermometer B is " + t);
	} // end main
} // end class ThermTest
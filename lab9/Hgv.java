package lab9;
//Hamed Zon
//C00259228
//HVG Class Extends RoadVehicle
public class Hgv extends RoadVehicle
{
	private int cargo;

	public Hgv()
    { 	
        this(0,0,0);	
    }

    public Hgv(int c, int w, int p)
    { 
        super(w, p);
        setCargo(c);
    }

    public void setCargo(int size)
    {
        cargo = size;
    }

    public int getCargo()
    {
        return cargo;
    }
    public double calculateDuty()
    {
        return HGVTAXERATE*getWheels();
    }
    public String toString()
    {
        String HgvInfo = super.toString() + "\nSize is: " + cargo;
        return HgvInfo;
    }
}

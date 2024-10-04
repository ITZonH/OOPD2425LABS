//ID: C00259228
//Name: Hamed Zon 
//This is the Address Class

package lab4;
public class Address
{
    private String city;
    private String street;
    private String county;

    public Address()
    {

    }
    public Address(String theCity, String theStreet, String theCounty)
    {
        city = theCity;
        street = theStreet;
        county = theCounty;

        
    }

    public void setCity(String theCity)
    {
        city = theCity;
    }
    public void setStreet(String theStreet)
    {
        street = theStreet;
    }

    public void setCounty(String theCounty)
    {
        county = theCounty;
    }

    public String getCity()
    {
        return city;
    }

    public String getStreet()
    {
        return street;
    }
    public String getCounty()
    {
        return county;
    }

    public String toString()
    {
        String employeesAddress ="";
        employeesAddress += getCity() +", "+ getStreet() +", "+ getCounty() ;
        return employeesAddress;
    }

}
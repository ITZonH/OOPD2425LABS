

package CA_Revisions;

public class DealerShip 
{
    private final int CARMAX = 3;
    private Car[] cars = new Car[CARMAX];
    private static int dealerNum = 1000;
    private Address dealerAdd;
    private int dealerId =0;
    private String dealerName;
    private int carIndex=0;

    public DealerShip()
    {
        this.dealerId = dealerNum;
        dealerNum++;
        this.dealerName = "";
    }

    public DealerShip( String dealerName)
    {
        this.dealerId = dealerNum;
        dealerNum++;
        this.dealerName = dealerName;
        
    }

    public String addCar(Car addCar)
    {
        if(carIndex<CARMAX)
            {
                cars[carIndex] = addCar;
                carIndex++;
                return "you have SuccessFully Added: " + carIndex;
            }
        else
            {
                return "Full: " + carIndex;
            }
    }

    public void setDealerName(String dealerName)
    {
        this.dealerName=dealerName;
    }

    public String getDealerName()
    {
        return dealerName;
    }

    public void setDealerAdd(Address dealAdd)
    {
        this.dealerAdd = dealAdd ;
    }

    public Address getAddress()
    {
        return dealerAdd;
    }
    public int getDealerId()
    {
        return dealerId;
    }

    public String toString()
    {
        
        String dealerInfos ="";
        dealerInfos += "Dealer's Name: " + dealerName + " Address : " + dealerAdd + " In dealerShip :"  + dealerId + " , have: " + carIndex + " car(s)";
        for(Car C:cars )
            {
               if(C != null)
                   {
                        dealerInfos += "Car Infos :" +"\n" + C.toString();
                    }
            }
            return dealerInfos;
    }

   


    
}

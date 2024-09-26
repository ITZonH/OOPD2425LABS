package lab3;

public class BankCustomer 
{
   private String name;
   private String address;
   private int accountIndex;
   private SavingAccount[] savigAccount;
   private static final int MAX_ACCOUNT=3;

   
   
   public BankCustomer(String theName, String theAddress)
   {
        name = theName;
        address = theAddress;
        savigAccount = new SavingAccount[3];
        accountIndex=0;

   }

   public void setName(String theName)
   {
        name = theName;

   }

   public void setAddress(String theAddress)
   {
        address = theAddress;
   }

   public String addAccount(SavingAccount newAccount)
   {
          if(accountIndex<MAX_ACCOUNT)
               {
                    savigAccount[accountIndex] = newAccount;
                    accountIndex++;
                    return "Account Successfully added";
               }
          else
               {
                    return "Max Account reached " + accountIndex ;
               }
   }
        
   public double getTotalBallance()
   {
     int totalBallance =0;
     for (int i = 0; i < MAX_ACCOUNT; i++) 
     {
           
           totalBallance += savigAccount[i].getBalance();
     }
       return totalBallance;

   }

   public String getNamed()
   {
     return name;
   }

   public String getAddress()
   {
          return address;
   }

   public String toString()
   {
     String myBkCustomerSrt = "Customer's Name: " + getNamed() + "\nAddress: "  + getAddress();
     for (int i = 0; i < accountIndex; i++) 
     {
          myBkCustomerSrt += "\nsavingAccount["+(i+1) +"] " + savigAccount[i].toString();
     }
     return myBkCustomerSrt;
   }
}


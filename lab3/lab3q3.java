package lab3;

public class lab3q3 
{
    public static void main(String[] args) 
    {
        BankCustomer myCounCustomer = new BankCustomer("Hamed Zon", "24 Pennefather Green Kilkenny");
        SavingAccount savingAccount1= new SavingAccount(2000);
        SavingAccount savingAccount2 = new SavingAccount(3000);
        SavingAccount savingAccount3 = new SavingAccount(4000);
        myCounCustomer.addAccount(savingAccount1);
        myCounCustomer.addAccount(savingAccount2);
        myCounCustomer.addAccount(savingAccount3);
        
        

        System.out.println(myCounCustomer.toString());
        
        System.out.println("Total Ballance:" + myCounCustomer.getTotalBallance());

        System.out.println("-------------------------------------------------------");

        BankCustomer myCounCustomer2 = new BankCustomer("Hamed Zon", "24 Pennefather Green Kilkenny");
        SavingAccount saving1= new SavingAccount(4000);
        SavingAccount saving2 = new SavingAccount(3000);
        SavingAccount saving3 = new SavingAccount(6000);
        myCounCustomer2.addAccount(saving1);
        myCounCustomer2.addAccount(saving2);
        myCounCustomer2.addAccount(saving3);
        

        
        System.out.println(myCounCustomer2.toString());
        System.out.println("Total Ballance:" + myCounCustomer2.getTotalBallance());
    }
    
}

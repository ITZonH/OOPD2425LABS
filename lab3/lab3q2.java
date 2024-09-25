//C00259228
//Hamed Zon
//This is the main 
package lab3;
public class lab3q2 
{
    public static void main(String[] args) 
    {
        SavingAccount sever1 = new SavingAccount();
        
        sever1.setSavingBanl(2000.00);
        sever1.calculateMonthlyIntR();
        System.out.println(sever1.getBalance());
        SavingAccount.modifyInterestRate(0.05);
        sever1.calculateMonthlyIntR();
        System.out.println(sever1.toString());

        System.out.println("-------------------------");

        SavingAccount sever2 =  new SavingAccount();
        sever2.setSavingBanl(3000.00);
        sever2.calculateMonthlyIntR();
        System.out.println(sever2.getBalance());
        SavingAccount.modifyInterestRate(0.05);
        sever2.calculateMonthlyIntR();
        System.out.println(sever2.toString());
        


        
    }
    
}

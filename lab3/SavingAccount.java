package lab3;

public class SavingAccount 
{
    private double savingBanl;
    private static double annualInteresRate = 0.04;  
    private int accountNumber;
    private static  int count = 0;
    

    public SavingAccount()
    {
        count++;
        accountNumber = count;

    }

    public SavingAccount(double balance)
    {   count++;
        accountNumber = count;
        savingBanl = balance;
    }

    public void setSavingBanl(double theSavingBanl)
    {
        savingBanl = theSavingBanl;
    }

    public void calculateMonthlyIntR()
    {
         savingBanl += (savingBanl*annualInteresRate)/12;
    }

    public static void modifyInterestRate(double newIntressRate)
    {
        annualInteresRate = newIntressRate;

    }
    public double getBalance()
    {
        return savingBanl;
    }
    public int getAccountNum()
    {
        return accountNumber;
    }

    public String toString()
    {
        String toSavingAccountString = "";

        toSavingAccountString += "Ballance is " + savingBanl;
        toSavingAccountString += "\nAccount N. " + accountNumber;

        return toSavingAccountString;


    }
}


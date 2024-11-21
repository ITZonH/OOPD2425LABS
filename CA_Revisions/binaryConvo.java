/**
 * binaryConvo
 */class binaryConvo 
{
    public static void main(String[] args) 
    {
        int num =7;

        int remi =0;
        String bina = "";

        while (num>0) 
        {
            remi = num%2;
            bina += remi;
            num = remi%2;
            bina +=num%2;
            
            
            
        }
        System.out.println(bina);
        
    }

     
}
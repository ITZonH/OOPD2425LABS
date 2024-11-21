package data_structure_algo;
import java.util.Scanner;
public class alphaOrder 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String[] names = new String[9];
        String[] order = new String[names.length];
        char ch1='a';
        char ch2='b';
        int i;
        int count =0;
        
        for(i=0;i<names.length;i++)
            {
                System.out.println(" enter names: " + (i+1));
                names[i]= in.next();

            }

            for(i=0;i<names.length;i++)
            {
                if(names[i].charAt(0)==ch1 || names[i].charAt(0)==ch2)
                    {
                        System.out.println(names[i]);

                    }
            }
            
    }
    
}

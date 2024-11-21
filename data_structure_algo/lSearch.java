package data_structure_algo;

public class lSearch 
{
    public static void main(String[] args) 
    {
        int[] arrayInt = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target=13;
        int location = search(target, arrayInt);

        if(location !=-1)
            {
                System.out.println(" at index " + location);
            }
        else
            {
                System.out.println("no");
            }
        
    }

    public static int search(int target , int[] num)
    {
        
        int i;
        //int location=0;
    

    
        for(i=0;i<num.length;i++)
        {
            if(num[i]==target)
                {
                    return i;
                    
                }
        }
        return -1;
    }
    
}

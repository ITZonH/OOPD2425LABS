package data_structure_algo;

public class binaSearch 
{
    public static void main(String[] args) 
    {
        int[] a ={1,2,3,4,5,6,7,8,9,10,11,12,13,15,15};
        int target = 9;

        int start = 0;
        int mid = 0;
        int end = a.length-1;

        while(start<=end)
        {
            mid = (start+end)/2;
            if(a[mid]<target)
                {
                    start = mid+1;
                    System.out.println(mid);
                }
            else if(a[mid]>target)
                {
                    end = mid-1;
                    System.out.println(mid);
                }
            else
                {
                    System.out.println(-1);
                }
                
        }
       
        
        
        
    }
    
}

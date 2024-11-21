import java.util.Scanner;
class likeSong
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String [] song = {"a","b","c","d"};
        String[] newSong;
        String like;
        int location=0;
        int size = song.length;
        newSong = new String[size];
        int i;
        

        

        
        for(i=0;i<song.length;i++)
            {

                System.out.println(" enter like");
                like = in.next();

                if(like.equalsIgnoreCase("like"))
                    {
                        if(location<size)
                            {
                                newSong[i] = song[i]; 
                                location++;
                               
                            }
                           
                           
                           
                    }

                    else    
                        {
                            System.out.println("****");
                        }

            }
            

            for( i =0; i <size; i++)
                {
                    if(newSong[i]!=null)
                    {
                        System.out.println(newSong[i]);
                    }
                }
            in.close();
    }
}
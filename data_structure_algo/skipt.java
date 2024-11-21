import java.util.Scanner;
class Skipt
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String nextSong;
        int location=-1;
        String [] song = {"a","b","c","d"};

        
        for(int i=0;i<song.length;i++)
            {

                System.out.println("skipt");
                nextSong = in.next();

                if(nextSong.equalsIgnoreCase("Skipe"))
                    {
                        location = i+1;
                        if(location<song.length)
                            {
                                System.out.println(song[location] + " playing at index: " + location);

                            }
                            else
                        {
                            System.out.println("No song to skipe");
    
                        }
                    }

                    else    
                        {
                            System.out.println(location);
                        }
                    
                       
               
                
            }
            in.close();
    }
}
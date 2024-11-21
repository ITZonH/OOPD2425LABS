package CA2_PROJEACT;

public class Room 
{
    private static int roomN = 200;
    private int roomID;
    private String roomName;
    private Student[] students = new Student[3];
    private int count =0;
    

    public Room()
    {
        this.roomName = "";
        this.roomID = roomN;
        roomN++;
    }

    public Room(String roomName)
    {
        this.roomName = roomName;
        this.roomID = roomN;
        roomN++;
        
    }

    public void setRName(String roomName)
    {
        this.roomName = roomName;
    }

    public String addStudent(Student addStudent)
    {
        if(count<3)
            {
                students[count] = addStudent;
                count++;
                return "You Have Successfully Added: " + count + " Student(s)";    
            }
        else
            {
                return " Sorry There Is no Space for This Student . We Already Have: " + count + " Students";
            }
    }

    public String getRName()
    {
        return roomName;
    }
    public int getRoomId()
    {
        return roomID;
    }

    @Override
    public String toString()
    {
        String roomDate = "\nRoom Name: " + roomName + "\nRoom ID: " + roomID;
        for(Student S: students)
            {
                if(S!=null)
                    {
                        roomDate += "\nStudent infos" + S.toString();
                    }
            }
            return roomDate;
    }

     
}
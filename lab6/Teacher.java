package lab6;
//Hamed Zon
//C00259228
//Teach Class to add and remove courses
public class Teacher extends Person
{
    private String[] courses;
    private int courseNum;

    
    public Teacher(String name,String address)
    {
        super(name,address);
        this.courses = new String[2];
        this.courseNum = 0;
    }

    public boolean addCourse(String courceCode)
    {

        if(courses[courseNum] !=null)
            {
                return false;
            }

        else
            {
                courses[courseNum] = courceCode;
                courseNum++;
                return true;
            }
    }

    public boolean removeCourse(String courseCode)
    {
        for(int i =0; i < courses.length; i++)
            {
                if(courses[i].equalsIgnoreCase(courseCode))

                    {
                        courses[i] ="";
                        courseNum--;
                        return true;
                    }
            }
        return false;
    }

    public String toString()
    {
        String teacherInfos ="";
        teacherInfos += "Teacher: " + super.toString() + "\n" ;
        for(int i = 0; i<courseNum;i++)
        {
             teacherInfos += courses[courseNum];   
        }

        return teacherInfos;
    }
    
}


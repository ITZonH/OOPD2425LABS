package lab8;
//C00259228
//Hamed Zon

public class Student extends Person
{
    private String course;
    public Student(String name, String course)
    {
        super(name);
        this.course = course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
    public String getDescription()
    {
        return "Student Study: " + course;
    }

    public String toString()
    {
        String StudentInfo = super.toString() +"\n"+ getDescription();
        return StudentInfo;
    }
}
package CA2_PROJEACT;
import CA_Revisions.Address;
public class Student
{
    private static int studentN = 259;
    private int studentId =0;
    private String fName;
    private String lName;
    private String course;
    private int age;
    private Address address;
    
    public Student()
    {

    }
    public Student(String fName, String lName,String course,int age)
    {
        this.fName = fName;
        this.lName = lName;
        this.course = course;
        this.age = age;
        this.studentId = studentN;
        studentN++;
        
    }

    public void setFName(String fName)
    {
        this.fName = fName;
    }
    public void setLName(String lName)
    {
        this.lName = lName;
    }
    public void setCourse(String course)
    {
        this.course = course;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setAddress(Address address)
    {
        this.address = address;
    }

    public String getFName()
    {
        return fName;
    }
    public String getLName()
    {
        return lName;
    }
    public String getCourse()
    {
        return course;
    }
    public int getAge()
    {
        return age;
    }
    public Address getAddress()
    {
        return address;
    }
    public int getStudentId()
    {
        return studentId;
    }

    @Override
    public String toString()
    {
        String studentData = "\nFirst Name: " + fName + "\nLast Name: " + lName + "\nCourse: " + course + "\nAddress: " + address + 
        "\nStudent ID: " + studentId;
        return studentData;
    }
    
}
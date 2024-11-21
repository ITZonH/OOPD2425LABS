package lab5.CA2_PROJEACT;
package 
public class Student 
{
    private String fName;
    private String lName;
    private String doB;
    private static int studentReg = 259;
    private int studentId = 0;
    private double grade;
    private Address Address;

    public Student()
    {

    }

    public Student(String fName, String lName, String doB,double grade, Address address)
    {
        this.fName = fName;
        this.lName = lName;
        this.doB = doB;
        this.studentId = studentReg;
        this.grade = grade;
        studentReg++;
        this.address = address;


    }

    public void setFName(String fName)
    {
        this.fName = fName;
    }

    public void setLName(String lName)
    {
        this.lName = lName;
    }
    public void setDOB(String doB)
    {
        this.doB = doB;
    }

    public void setStudentGrade(double grade)
    {
        this.grade = grade;
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
    public String getDOB()
    {
        return doB;
    }
    public int getStudentId()
    {
        return studentId;
    }
    public double getGrade()
    {
        return grade;
    }

    public Address getAddress()
    {
        return address;
    }

    @Override
    public String toString() {
        return "Student Details:" +
                "\nFirst Name: " + fName +
                "\nLast Name: " + lName +
                "\nDate of Birth: " + doB +
                "\nStudent ID: " + studentId +
                "\nGrade: " + grade; +
                "\nAddress: " + address;

    }
    
} 

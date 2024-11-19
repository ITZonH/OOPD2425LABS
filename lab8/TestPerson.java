package lab8;
//c00259228
//Hamed Zon

public class TestPerson
{
    public static  void main(String [] args)
    {
        Employee employee = new Employee("Ben",7000);
        Student student =  new Student("Marcus", "SofD");
        System.out.println(employee.toString());
        System.out.println(student.toString());
    }
}
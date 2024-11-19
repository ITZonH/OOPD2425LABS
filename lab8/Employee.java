package lab8;
//Hamed Zon
//C00259228
public class Employee extends Person
{
    private double salary;

    public Employee(String name, double salary)
    {
        super(name);
        this.salary = salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public String getDescription()
    {
        return "Employee's Anually Salary is :" + salary;
    }
    
  public String toString()  
  {
    String EmployeeInfo =  super.toString() + "\n" + getDescription();
    return EmployeeInfo;
  }
}
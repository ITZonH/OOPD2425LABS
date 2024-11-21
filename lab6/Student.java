package lab6;
//Hamed Zon
//C00259228
//Student Class

public class Student extends Person
{
    private int courseNum;
    private String[] courses;
    private int[] grades;
    private int average;
    

   public Student(String name, String address)
   {
        super(name, address);
        this.courses = new String[2];
        this.courseNum = 0;
        this.grades = new int[2];
        this.average =0;
        
        
   }

   public void addCourseGrade(String courseCode, int grade)
   {
        courses[courseNum] = courseCode;
        grades[courseNum] = grade;
        courseNum++;
   }

   public void printGrades()
   {
     System.out.println("Student: " + super.toString());
     for(int i =0; i<courseNum; i++)
          {
               System.out.println( "Grades: " + grades[i] + " Course Codes: " + courses[i]);
          }
     
   }

   public double getAverageGrade()
   {
     for(int i =0; i<courseNum; i ++)
          {
               average += (grades[i])/2;
          }
        
        return average;
   }

   public String toString()
   {
        String studentInfos ="";
        studentInfos += super.toString() + "\nAverage: " +  average;
        for(int i = 0; i<courseNum;i++)
          {
               studentInfos += courses[courseNum];
               studentInfos += grades[courseNum];
          }
        return studentInfos;
   }




}
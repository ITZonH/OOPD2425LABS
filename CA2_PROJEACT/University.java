package CA2_PROJEACT;
import java.util.Scanner;

import CA_Revisions.Address;
public class University
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[10];
        Student student;
        Room[] rooms = new Room[5];
        Room room;
        String fName;
        String lName;
        String roomName;
        int age;
        String course;
        Address address;
        String city;
        String street;
        String county;
        int option =0;
        int index;
        int count =0;
        int classes =0;
        int classIndex =0;

        for(index = 0; index<rooms.length; index++)
            {
                room = new Room();
                rooms[index] = room;
            }

        while(option !=4)
            {
                System.out.println("Please sellect an option for diferrent operation");
                System.out.println("1 to view all class infos");
                System.out.println("2 to add Students in classes");
                System.out.println("3 to view all Students infos");
                option = in.nextInt();

            switch (option) 
                {
                    case 1:
                        {
                            if(classes == 0)
                                {
                                    for(index=0;index<rooms.length;index++)
                                        {
                                            System.out.println("Enter Class Name");
                                            roomName = in.next();
                                            room = new Room(roomName);
                                            rooms[index].setRName(roomName);
                                            classes++;
                                        }


                                }
                            else    
                                {
                                    for(index = 0; index <rooms.length ; index++)
                                    {
                                        System.out.println(rooms[index].toString());
                                    }
                                }
                        }
                        
                        break;
                    case 2:
                        {
                            System.out.println("First Name: ");
                            fName = in.next();

                            System.out.println("Last Name: ");
                            lName = in.next();
                             
                            System.out.println("Age: ");
                            age = in.nextInt();

                            System.out.println("Course: ");
                            course = in.next();

                            System.out.println("City");
                            city = in.next();
                            System.out.println("Street");
                            street = in.next();
                            System.out.println("County");
                            county = in.next();
                            if(count<students.length)
                                {
                                    address = new Address(city,street,county);
                                    student = new Student(fName, lName,course,age);
                                    students[count] = student;
                                    students[count].setAddress(address);
                                    rooms[classIndex].addStudent(student);
                                    classIndex = (classIndex+1)% rooms.length;
                                    count++;
                                }

                        }
                        break;
                    case 3:
                        {
                            for(index = 0; index<students.length; index++)
                                {
                                    if(students[index] !=null)
                                        {
                                            System.out.println(students[index].toString());
                                        }
                                    else
                                        {
                                            System.out.println("You have :" + count + " student sellect 2 to add more");
                                            break;
                                        }
                                    
                                }

                        }
                        break;
                    case 4:
                        {
                            System.out.println("You Have Exit!!!");
                        }
                
                   
                }

        }

    


        in.close();
    }

}
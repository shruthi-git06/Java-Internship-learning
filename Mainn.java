import java.util.*;
class Student{
    int id;
    String name;
    String dept;
    double cgpa;
    Student(){
        id=0;
        name="Not assigned";
        dept="Unknown";
        cgpa=0.0;

    }
    Student(int id,String name){
        this.id=id;
        this.name=name;
        dept="AI";
        cgpa=0.0;
    }
    Student(int id,String name,String dept,double cgpa){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.cgpa=cgpa;
    }
    void displaydetails(){
        System.out.println("Student id="+id);
        System.out.println("Student name="+name);
        System.out.println("Student dept="+dept);
        System.out.println("Student cgpa="+cgpa);
    }
}
public class Mainn{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student(101, "Shruthi");
        Student s3=new Student(102, "Sandra", "CSE", 8.88);

        s1.displaydetails();
        s2.displaydetails();
        s3.displaydetails();
    }
        
}
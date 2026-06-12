import java.util.*;
class Student{
    int id;
    String name;
    int age;

    public  Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "ID: "+id + " | Name: "+name+" | Age: "+age;
    }
}
interface StudentService{
    void createStudent();
    void viewStudents();
    void updateStudent();
    void deleteStudent();
}
class StudentServiceimpl implements StudentService{
    ArrayList<Student> studentList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    public void createStudent(){
        System.out.println("Enter Student ID: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Student Age: ");
        int age=sc.nextInt();

        studentList.add(new Student(id,name,age));
        System.out.println("---Student Added Successfully---");
    }
    public void viewStudents(){
        if(studentList.isEmpty()){
            System.out.println("No Student records found");
            return;
        }
        System.out.println("---Student List---");
        for(Student s:studentList){
            System.out.println(s);
        }

    }
    public void updateStudent(){
        System.out.println("Enter the Student ID to update: ");
        int searchId=sc.nextInt();
        sc.nextLine();

        for(Student s:studentList){
            if(s.id==searchId){
                System.out.println("Enter new Name: ");
                s.name=sc.nextLine();
                System.out.println("Enter new age: ");
                s.age=sc.nextInt();

                System.out.println("Student records updated");
                return;
            }

        }
        System.out.println("Student ID with "+searchId+"not found");
    }
    public void deleteStudent(){
        System.out.println("Enter Student ID to remove: ");
        int searchId=sc.nextInt();
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).id==searchId){
                studentList.remove(i);
                System.out.println("Student record deleted successfully.");
                return;

            }
        }
        System.out.println("Student with ID " + searchId + " not found.");
    }
}
public class StudentController{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;

        StudentService service=new StudentServiceimpl();
        do{
            System.out.println("===STUDENT MANAGEMNET SYSTEM===\n"+
                    "1. Create Student\n" +
                    "2. View Students\n" +
                    "3. Update Student\n" +
                    "4. Delete Student\n" +
                    "5. Exit\n" +
                    "Enter your choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1: service.createStudent();break;
                case 2: service.viewStudents();break;
                case 3: service.updateStudent();break;
                case 4: service.deleteStudent();break;
                case 5: System.out.println("Exiting program....Goodbye!");break;
                default: System.out.println("Invalid choice");
            }
        }while(choice!=5);
        sc.close();
    }
}
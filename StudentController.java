import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n====STUDENT MANAGEMENT SYSTEM===\n" +
                    "1. Create Student\n" +
                    "2. View All Students\n" +
                    "3. Update Student\n" +
                    "4. Delete Student\n" +
                    "5. Exit\n" +
                    "Enter your choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1: createStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting application..GoodBye!"); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while(choice != 5);
        sc.close();
    }

    private static void createStudent() {
        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Clear buffer
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Student Age: ");
        int age = sc.nextInt();

        Student newStudent = new Student(id, name, age);
        studentList.add(newStudent);
        System.out.println("Student added successfully!");
    }

    private static void viewStudents() {
        // Fixed syntax error here
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        System.out.println("\n--- Student List ---");
        for(Student s : studentList) {
            System.out.println(s);
        }
    }

    private static void updateStudent() {
        System.out.println("Enter Student ID to update: ");
        int searchId = sc.nextInt();
        sc.nextLine(); // Clear buffer

        for(Student s : studentList) {
            if(s.getId() == searchId){
                System.out.println("Enter new Name: ");
                String newName = sc.nextLine();
                System.out.println("Enter New Age: ");
                int newAge = sc.nextInt();

                // Fixed the setter logic here
                s.setName(newName);
                s.setAge(newAge);
                System.out.println("Student records updated!");
                return;
            }
        }
        System.out.println("Student with ID " + searchId + " not found.");
    }

    private static void deleteStudent() {
        System.out.println("Enter Student ID to delete: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getId() == searchId) {
                studentList.remove(i);
                System.out.println("Student record deleted successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + searchId + " not found.");
    }
}

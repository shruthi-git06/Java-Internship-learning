class Person {
    int age=20;
    String name="Shruthi";
    void displayPerson(){
        System.out.println("Age="+age);
        System.out.println("Name="+name);
    }
    
}
class Employee extends Person{
    double salary=50000;
    void displaySalary(){
        System.out.println("Salary="+salary);
    }
}
public class In{
    public static void main(String[] args){
        Employee e=new Employee();
        e.displayPerson();
        e.displaySalary();
    }
}

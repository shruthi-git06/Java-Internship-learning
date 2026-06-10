import java.util.*;
public class Calc{
    public static void main(String[] args){
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Addition\n2.Subtraction\n");
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();
        switch(choice){
            case 1: int num1,num2;
                    System.out.println("Enter the two numbers to add: ");
                    num1=sc.nextInt();
                    num2=sc.nextInt();
                    int sum=num1+num2;
                    System.out.println("Sum="+sum);
                    break;
            case 2 : int num1,num2;
                     System.out.println("Enter the two numbers to subtract: ");
                     num1=sc.nextInt();
                     num2=sc.nextInt();
                     int diff=num1-num2;
                     System.out.println("Difference="+diff);
                     break;
            default: System.out.println("Invalid choice");
            
        }

    }
}
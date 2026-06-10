import java.util.*;
public class Simplecalc {
    public static void main(String[] args){
        int num1,num2,choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();
        switch(choice){
            case 1: int sum;
                    sum=num1+num2;
                    System.out.println("Sum= "+sum);
                    break;
            case 2: int difference;
                    difference=num1-num2;
                    break;
            case 3: int product;
                    product=num1*num2;
                    System.out.println("Product= "+product);
                    break;
            case 4: try{
                        float d= (float) num1/num2;
                        System.out.println(num1+"/"+num2+"="+d);
                    }
                    catch (ArithmeticException e){
                      System.out.println("Can't divide by zero");
                    }break;

            default: System.out.println("Invalid choice");
        }
    }
}

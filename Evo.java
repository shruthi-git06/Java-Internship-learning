import java.util.*;
public class Evo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number to check: ");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even number");

        }
        else{
            System.out.println("Odd number");
        }
    }
    
}

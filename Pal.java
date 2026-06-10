import java.util.*;
public class Pal{
    public static void main(String[] args){
        int n,rev=0,digit,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        n=sc.nextInt();
        temp=n;
        while(n>0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(rev==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
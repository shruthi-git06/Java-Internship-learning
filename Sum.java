import java.util.*;
public class Sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        int i=0;
        System.out.println("Enter the limit: ");
        n=sc.nextInt();
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of "+n +" numbers is "+sum);

    }
    
}

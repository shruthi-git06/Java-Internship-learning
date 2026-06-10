import java.util.*;
public class Reverse {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
     }
}

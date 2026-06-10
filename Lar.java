import java.util.*;
public class Lar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int large=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                large=arr[i+1];
            }
        }
        System.out.println("Largest of elements="+large);
    }
}
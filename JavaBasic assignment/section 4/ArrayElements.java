import java.util.Scanner;
public class ArrayElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        int sum=0;
        double avg;
        System.out.println("Enter the values in the array");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of array elements:");
        for(i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        
        avg=(double)sum/n;
        System.out.println("Average of array elements:"+avg);
    }

}

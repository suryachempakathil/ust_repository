import java.util.Scanner;
public class FindLargestSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        System.out.println("Enter the values in the array");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int large=arr[0];
        int small=arr[0];
        for(i=0;i<n;i++){
          if(arr[i]>large){
            large=arr[i];
          }
          if (arr[i]<small) {
            small=arr[i];
          }
        }
        System.out.println("Largest element:"+large);
        System.out.println("Smallest element:"+small);
}
}

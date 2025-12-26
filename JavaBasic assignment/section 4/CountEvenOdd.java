import java.util.Scanner;
public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int i;
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(i=0;i<n;i++){
            if(arr[i]%2 == 0){
                even++;

            }
            else{
                odd++;
            }
        }
        System.out.println("count of even number:"+even);
         System.out.println("count of odd number:"+odd);

    }
}

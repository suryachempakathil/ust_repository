import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements:");
        int i,j,temp;
        for(i=0;i<n;i++){
           a[i]=sc.nextInt();
        }
        System.out.println("Array elements in ascending order");
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                      temp=a[i];
                      a[i]=a[j];
                      a[j]=temp;
                }
            }
        }
         for ( i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
         }
    }
}

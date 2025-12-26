import java.util.Scanner;
public class LinearSearch {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int i;
    System.out.println("Enter the array elements:");
    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the element to search ");
    int search=sc.nextInt();
    int position=-1;
    for(i=0;i<n;i++){
        if(search == arr[i]){
         position=i+1;
         break;
    }
    }
if (position != -1){
    System.out.println("Element found at position :"+position);
}else{
    System.out.println("Element not found");
}
}
}

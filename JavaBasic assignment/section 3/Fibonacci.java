import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=0,num2=1,num3;
        System.out.println("Enter the size");
        int size=sc.nextInt();
        System.out.println("Fibonacci series");
        System.out.println(num1);
        System.out.println(num2);

        for(int i=3;i<=size;i++){
            num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
        }


    }
}

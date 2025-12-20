
import java.util.Scanner;
public class Operation{
    public static void main(String[] args) {
        int num1,num2;
        float sum,diff,product,quotient;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st number");
        num1=sc.nextInt();
        System.out.println("enter the 2nd number");
        num2=sc.nextInt();
       sum=num1+num2;
       diff=num1-num2;
       product=num1*num2;
       quotient=(float)num1/num2;
       System.out.println("sum of " +num1+ " and " +num2+ " is " +sum);
       System.out.println("difference of "+num1+ " and "+num2+" is "+diff);
       System.out.println("product of "+num1+ " and "+num2+" is "+product);
       System.out.println("quoitent of "+num1+ " and "+num2+" is 0"+quotient);

        sc.close();
    }
}
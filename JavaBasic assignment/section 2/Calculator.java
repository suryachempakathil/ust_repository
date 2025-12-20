import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a=sc.nextInt();
         System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
        System.out.println(" 1.Add \n 2.subtraction \n 3.multiplication\n 4.Division \n Enter your choice");
        int choice=sc.nextInt();
        float result;
        switch (choice) {
            case 1:result=a+b;
                   System.out.println("Result:"+result);
                
                break;
            case 2:result=a-b;
                   System.out.println("Result:"+result);
                
                break;
            case 3:result=a*b;
                   System.out.println("Result:"+result);
                    break;
             case 4:result=(float)a%b;
                   System.out.println("Result:"+result);
                
                break;
            default:System.out.println("wrong choice");
                break;
        }
    }
}

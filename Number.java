import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
       
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
         float num = sc.nextFloat();
        if (num > 0){
            System.out.println("The number is positive");
        }else if(num <0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
      sc.close();

    }
}

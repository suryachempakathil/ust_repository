import java.util.Scanner;
public class Factorial {
    public double fact(int n){
        double fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  number");
        int n=sc.nextInt();
        Factorial f=new Factorial();
         double result= f.fact(n);
         System.out.println("factorial of the number:"+result);

       sc.close();

    }
}

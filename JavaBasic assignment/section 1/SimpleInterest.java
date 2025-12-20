import java.util.Scanner;
public class SimpleInterest {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double si;
        System.out.println("Enter the principle amount");
        double p=sc.nextInt();
        System.out.println("Enter the rate of interest");
        double r=sc.nextInt();
        System.out.println("Enter the time period");
        double t=sc.nextInt();
        si=(p*r*t)/100;
        System.out.println("Simple Interest = "+si);
    sc.close();
    }
}

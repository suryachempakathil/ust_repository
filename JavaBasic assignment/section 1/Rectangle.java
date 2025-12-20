import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        double area,perimeter;
        System.out.println("Enter the length");
        double l=sc.nextInt();
        System.out.println("Enter the rate of breadth");
        double b=sc.nextInt();
        area=l*b;
        perimeter=2*(l+b);
      System.out.println("Area of rectangle is " +area);
      System.out.println("perimeter of rectangle is "+perimeter);
    }
}

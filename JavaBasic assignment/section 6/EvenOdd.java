import java.util.Scanner;

public class EvenOdd {

    public void even(int n) {
        if (n % 2 == 0) {
            System.out.println("Even number");
        }
    }

    public void odd(int n) {
        if (n % 2 != 0) {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        EvenOdd eo = new EvenOdd();
        eo.even(n);
        eo.odd(n);
    }
}

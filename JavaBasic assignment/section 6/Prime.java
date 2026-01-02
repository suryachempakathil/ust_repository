import java.util.Scanner;

public class Prime {

    public void isPrime(int n) {
        if (n <= 1) {
            System.out.println("Not a prime number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        Prime p = new Prime();
        p.isPrime(n);

        sc.close();
    }
}

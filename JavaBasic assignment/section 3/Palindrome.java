import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int reverse=0;
        int p = num;
        while(num > 0){
            int digit= num%10;
            reverse=reverse*10+digit;
            num =num/10;
        }
        if(p == reverse){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }
    }
}

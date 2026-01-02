import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string");
        String str = sc.nextLine();
        String rev = "";
        String temp=str;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if(temp.equals(rev)){
            System.out.println("String palindrome");
        }
        else{
            System.out.println("String not a plindrome");
        }
    }
}

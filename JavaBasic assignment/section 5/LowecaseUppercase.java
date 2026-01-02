import java.util.Scanner;
public class LowecaseUppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("String to uppercase:"+str.toUpperCase());
     System.out.println("String to lowercase:"+str.toLowerCase());

    }
}

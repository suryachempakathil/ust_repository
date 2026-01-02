import java.util.Scanner;
public class FindMaximum {
    public void findmax(int a ,int b){
        if(a > b){
            System.out.println("Maximum number is:"+a);
        }else{
              System.out.println("Maximum number is:"+b);

        }}

        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 2 numbers:");
            int a =sc.nextInt();
            int b=sc.nextInt();
            FindMaximum f=new FindMaximum();
            f.findmax(a, b);
            sc.close();

        
    }
}

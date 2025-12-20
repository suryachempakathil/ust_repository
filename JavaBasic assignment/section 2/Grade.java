import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float avg;
        System.out.println("Enter the mark of subject1");
        int sub1=sc.nextInt();
        System.out.println("Enter the mark of subject2");
        int sub2=sc.nextInt();
        System.out.println("Enter the mark of subject3");
        int sub3=sc.nextInt();
        System.out.println("Enter the mark of subject4");
        int sub4=sc.nextInt();
        avg=(float)(sub1+sub2+sub3+sub4)/4;
        if(avg>=90){
            System.out.println("Grade:A");
        }else if(avg>=75){
             System.out.println("Grade:B");
        }else if(avg>=60){
             System.out.println("Grade:c");
        }else{
             System.out.println("Fail");
        }
}
    }
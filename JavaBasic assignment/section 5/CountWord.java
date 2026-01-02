import java.util.Scanner;
public class CountWord {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str="";
            System.out.println("Enter the sentence");
            str=sc.nextLine();
            int count=0;
            boolean word = false;
            for(int i=0;i<str.length();i++){
                if (str.charAt(i) != ' ' && !word) {
                        count++;
                        word = true;
                    } else if (str.charAt(i) == ' ') {
                        word = false;
                    }

            }
            System.out.println("Number of words int the sentence:"+count);
    }

}

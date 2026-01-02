import java.util.Scanner;
public class DuplicateCharacter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int n=str.length();
        String duplicate="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(str.charAt(i) == str.charAt(j)){
                    duplicate= duplicate+str.charAt(i);
                }
            }
        }
        System.out.println("Duplicate character:"+duplicate);
    }
}
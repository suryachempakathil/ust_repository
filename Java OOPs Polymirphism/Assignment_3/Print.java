package Assignment_3;

public class Print {
    public void print(int a){
        System.out.println(a);
    }
    public void print(String a){
        System.out.println(a);
    }
     public void print(int b,String a){
        System.out.println(b+"  " +a);
    }
public static void main(String[] args) {
    Print p=new Print();
    p.print(2);
    p.print("surya");
    p.print(55,"surya");
}
}

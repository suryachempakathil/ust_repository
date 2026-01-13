package Assignment_1;
public class Calculator {
    public void add(int a, int b){
        int sum=a+b;
         System.out.println("sum: "+sum);
    }
     public void add(int a, int b,int c){
        int sum=a+b+c;
         System.out.println("sum: "+sum);

    }
     public void add(double a, double b){
        double sum=a+b;
         System.out.println("sum: "+sum);
    }

    public static void main(String[] args) {
        Calculator ca=new Calculator();
        ca.add(3, 5);
        ca.add(3,5,6);
        ca.add(4.5, 3.4);
    }
}

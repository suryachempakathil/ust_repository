package Assignment_5;

public class Payment {
    public void pay(int amount){
          System.out.println(amount);
    }
    public void pay(int amount,String mode){
        System.out.println("payment done in "+mode);

    }
    public static void main(String[] args) {
        Payment p=new Payment();
        p.pay(5000);
        p.pay(5000, "online");
    }
}

package Assignment_5;

public class SavingAccount extends Bank{
   
    public void calculateInterest(double balance){
          double interest=balance * interestrate/100;
          System.out.println("Interest Amount: " +interest);

    }
public static void main(String[] args) {
    SavingAccount sa=new SavingAccount();
    sa.setInterestrate(6);
    sa.calculateInterest(100000);
}
    
}

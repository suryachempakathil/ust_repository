package Assignment_7;

class Bank{
    void getInterestRate(){
        System.out.println("interest rate : 4 %");
    }
}
class Sbi extends Bank{
    @Override
    void getInterestRate(){
        System.out.println("SBI interest rate : 6 %");
    }
}
class Hdfc extends Bank{
    @Override
    void getInterestRate(){
        System.out.println("HDFC interest rate : 7 %");
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank;
       bank = new Sbi();
       bank.getInterestRate();
       bank = new Hdfc();
       bank.getInterestRate();
        
    }
    
}

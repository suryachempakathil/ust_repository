package Assignment_2;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bk=new BankAccount();
        bk.setAcc(12345678);
        bk.setBal(-123);
        System.out.println("Account Balance:"+bk.getBal());
        
    }
    
}

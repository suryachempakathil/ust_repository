package Assignment_5;

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    // Constructor to initialize data
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Method to display account details
    void showAccount() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
        System.out.println("----------------------------");
    }
}
    public class BankAcoountTest {
        public static void main(String[] args) {
              // Object initialization
        BankAccount acc1 = new BankAccount(101, "Surya", 25000.50);

        acc1.showAccount();
        }
      
    
}

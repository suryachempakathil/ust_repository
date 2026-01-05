package Assignment_8;

public class ATMAccount {
    private String pin;
    private double balance = 1000;

    public void setPin(String pin) {
        if (pin.matches("\\d{4}")) {
            this.pin = pin;
        } else {
            System.out.println("Invalid PIN. Must be exactly 4 digits.");
        }
    }

    public void withdraw(double amount, String enteredPin) {
        if (!enteredPin.equals(pin)) {
            System.out.println("Incorrect PIN");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

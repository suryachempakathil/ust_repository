package Assignment_8;

public class ATMAccountTest {
    public static void main(String[] args) {

        ATMAccount atm = new ATMAccount();

        atm.setPin("1234");

        atm.withdraw(500, "1234");

        System.out.println("Final Balance: " + atm.getBalance());

        atm.withdraw(200, "1111");
    }
}

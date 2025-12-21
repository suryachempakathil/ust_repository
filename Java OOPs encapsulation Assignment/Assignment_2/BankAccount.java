package Assignment_2;

public class BankAccount {
    private int acc;
    private double bal;
    
    public double getBal() {
        return bal;
    }
    public void setBal(double bal) {
        if(bal < 0){
            this.bal = 0;
        }else{
        this.bal = bal;
        }
    }
    public void setAcc(int acc) {
        this.acc = acc;
    }
     
}

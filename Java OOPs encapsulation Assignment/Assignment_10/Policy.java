package Assignment_10;

public class Policy {
    private int Policyid;
    private double premium;
    public void setPolicyid(int policyid) {
        Policyid = policyid;
    }
    public void setPremium(int age) {
        if(age < 18){
            System.out.println("Not eligible");
        }else if(age <= 30){
            premium = 5000;
        }else if(age <= 45){
            premium =8000;
        }else if(age <= 60){
            premium = 12000;

        }else{
            premium = 18000;
        }
    }
    public double getPremium() {
        return premium;
    }
    
    
    
}

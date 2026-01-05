package Assignment_10;

public class PolicyTest {
    public static void main(String[] args) {
        Policy po=new Policy();
        po.setPolicyid(3);
        po.setPremium(60);
        System.out.println("Insurance premium: "+po.getPremium());
    }
}

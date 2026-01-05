package Assignment_7;

public class MobileTest {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.setBrand("Vivo");
        m.setPrice(30000);
        System.out.println("brand: " +m.getBrand()+ "\n price and gst " +m.getPrice());
    }
}

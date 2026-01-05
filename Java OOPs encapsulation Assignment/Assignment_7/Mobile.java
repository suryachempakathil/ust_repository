package Assignment_7;

public class Mobile {
    private String brand;
    private int price;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        double gst=price*0.18;
       
        return price + gst;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}

package Assignment_4;

public class Product {
    private int price;

    public void setPrice(int price) {
        if(price >= 100 && price <= 100000){
        this.price = price;

        }else{
            System.out.println("Invalid price.price must be between 100-100000");
        }
    }

    public int getPrice() {
        return price;
    }
    
}

package Assignment_6;

class Product{
    private int pid;
    private String pname;
    private double price;
    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }
    void displayProduct() {
        System.out.println("Product ID   : " + pid);
        System.out.println("Product Name : " + pname);
        System.out.println("Price        : " + price);
        System.out.println("---------------------------");
    }
    
}
public class ProductManagement {
    public static void main(String[] args) {
        Product p=new Product(102, "computer", 65000);
        p.displayProduct();
    }
}

package Assignment_8;
class Mobile{
    private String brand;
    private int ram;
    private int storage;
    private double price;
    public Mobile(String brand) {
        this.brand = brand;
        this.storage=64;
        this.ram=4;
        this.price=10000;
    }
    public Mobile(String brand, int ram, int storage) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.price=20000;
    }
    public Mobile(String brand, int ram, int storage, double price) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }
     void printConfig() {
        System.out.println("Brand   : " + brand);
        System.out.println("RAM     : " + ram + " GB");
        System.out.println("Storage : " + storage + " GB");
        System.out.println("Price   : " + price);
        System.out.println("---------------------------");
    }

}
public class MobileStore {
    public static void main(String[] args) {
        Mobile m1=new  Mobile("vivo");
        Mobile m2=new  Mobile("apple", 6, 120);
        Mobile m3=new Mobile("oppo", 3, 64, 10000);
        m1.printConfig();
        m2.printConfig();
        m3.printConfig();
        
    }
}

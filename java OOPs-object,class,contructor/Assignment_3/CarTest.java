class Car{
    String brand;
    String model;
    double price;
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
 void display() {
        System.out.println("Brand  : " + brand);
        System.out.println("Model  : " + model);
        System.out.println("Price  : " + price);
        System.out.println("--------------------");
 }

}

public class CarTest {
    public static void main(String[] args) {
        Car c1=new Car("maruthi suzuki", "swift", 800000);
        Car c2=new Car("honda", "city", 140000);
         c1.display();
         c2.display();
        
    }
}

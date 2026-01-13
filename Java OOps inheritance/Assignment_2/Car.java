package Assignment_2;

public class Car extends Vechicle{
    private String brand;
    
     public void setBrand(String brand) {
        this.brand = brand;
    }

     private void display(){
        System.out.println("Brand: " +brand);
        System.out.println("Speed : "+getSpeed()+"km/h");
     }
     public static void main(String[] args) {
        Car c=new Car();
        c.setBrand("BMW");
        c.setSpeed(70);
        c.display();
     }
}

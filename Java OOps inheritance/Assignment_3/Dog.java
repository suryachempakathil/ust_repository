package Assignment_3;

public class Dog extends Animal {
    public void bark(){
        System.out.println("Dod is Barking");
    }
    public static void main(String[] args) {
        Dog d=new Dog();
            d.eat();
            d.bark();
        
    }
}

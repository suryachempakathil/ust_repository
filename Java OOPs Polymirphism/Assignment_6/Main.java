package Assignment_6;
 class Shape {
    void draw(){
        System.out.println("Drawing a shape");
    }
}
 class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}
public class Main {

    public static void main(String[] args) {
        Shape s=new Shape();
        s.draw();
        s=new Circle();
        s.draw();
        s=new Rectangle();
        s.draw();
        
        
    }
}
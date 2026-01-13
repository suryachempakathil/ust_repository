package Assignment_2;

public class Area {
    public int area(int side){
        return side*side;
    }
     public int area(int length,int braedth){
        return length*braedth;
    }
     public double area(double radius){
        double area=3.15*radius*radius;
        return area;
    }


    public static void main(String[] args) {
        Area a=new Area();
        int square=a.area(5);
        int rect=a.area(2, 4);
        double circle=a.area(4);
        System.out.println("Area of the square: "+square);
        System.out.println("Area of the rectangle : "+rect);
        System.out.println("Area of the circle: "+circle );

        
    }
}

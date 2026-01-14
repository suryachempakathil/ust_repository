
class Student{
    public int id;
    public String name;
    void display(){
        System.out.println("Student id : " +id);
        System.out.println("Student name : " +name);
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Student s=new Student();
        s.id=1;
        s.name="surya";
        s.display();
    }
}

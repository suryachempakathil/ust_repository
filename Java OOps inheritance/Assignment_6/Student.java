package Assignment_6;

public class Student extends Person{
    private int rollNo;
    public Student(String name, int rollNo) {
        super(name);        
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s = new Student("Rahul", 101);
        s.display();
    }
    
}

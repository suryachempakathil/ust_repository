package Assignment_1;

public class Student extends Person {
    private int rollno;

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void displayDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Roll no: "+rollno);

    }
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Surya");
        s.setAge(22);
        s.setRollno(55);
         s.displayDetails();
    }
    
}

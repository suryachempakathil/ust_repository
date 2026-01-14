package Assignment_10;
class Student{
  String admissiontype;

  public Student() {
    admissiontype="general";
  }

  public Student(int mark) {
     admissiontype="merit";

  }
   void displayAdmission() {
        System.out.println("Admission Type: " + admissiontype);
    }
  
}
public class Admission {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(70);
        s1.displayAdmission();
        s2.displayAdmission();
    }
}

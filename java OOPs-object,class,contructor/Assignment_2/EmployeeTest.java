class Employee{
    public int empid;
    public String empname;
    public double salary;

    public Employee() {
        empid = 101;
        empname="surya";
        salary=40000;
    }
    void display(){
System.out.println("Employee details:");
        System.out.println("Employee id     : " + empid);
        System.out.println("Employee name   : " + empname);
        System.out.println("Employee salary : " + salary);    }

}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.display();
    }
}

package Assignment_3;

public class Employee {
    private int empid;
    private double empsal;

   
    public void setEmpid(int empid) {
        empid = empid;
    }

    public void setEmpsal(double empsal) {
      if(empsal > 0){
        this.empsal = empsal;
      }else{
        System.out.println("Salary must be positive number");
      }
    }

    public void displaysalary(){
        System.out.println("Employee salary: "+empsal);

    }
}

package Assignment_4;

public class Manager extends Employee {
    private double bonus;

     public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void salary(){
        double salary=getSalary()+ bonus;
        System.out.println("Total salary:" + salary);
    }
    public static void main(String[] args) {
        Manager m=new Manager();
        m.setSalary(10000);
        m.setBonus(1000);
        m.salary();
    }
  
}

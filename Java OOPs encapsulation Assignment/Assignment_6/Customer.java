package Assignment_6;

public class Customer {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age>=18){
        this.age = age;

        }else{
            System.out.println("age must be greater than or eual to 18");
        }
    }
    public String details(){
        return "customer name: " +name+  "\n age:" +age;
    }
    
}

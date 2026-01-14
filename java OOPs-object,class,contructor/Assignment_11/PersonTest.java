package Assignment_11;
class Person{
    String name;
    int age;
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this(name);
        this.age = age;
    }
    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("--------------------");
    }
}
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person("surya");
        Person p2=new Person("surya",21);
        p1.displayPerson();
        p2.displayPerson();
    }
}

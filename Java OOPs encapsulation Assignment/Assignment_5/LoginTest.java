package Assignment_5;

public class LoginTest {
    public static void main(String[] args) {
        Login l=new Login();
        l.setUsername("admin@123");
        l.setPassword("12345678");
        System.out.println("username:"+l.getUsername());
        System.out.println("password:"+l.getPassword());
    }
}

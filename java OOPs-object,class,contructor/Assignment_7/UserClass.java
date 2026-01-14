package Assignment_7;
class User{
    private String email;
    private String password;
    public User(String email) {
        this.email = email;
    }
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
     void displayUser() {
        System.out.println("Email    : " + email);
        System.out.println("Password : " + password);
        System.out.println("---------------------------");
    }
}
public class UserClass {
  public static void main(String[] args) {
    User u1=new User("admin@gmail.com");
    User u2=new User("admin@gmail.com", "admin123");
    u1.displayUser();
    u2.displayUser();
    
  }  
}

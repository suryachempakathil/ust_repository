package Assignment_4;

public class Login {
    public void login(String email){
        System.out.println("email:"+email);
    }
    public void login(String email,String password){
        System.out.println("Succesfully login");
    }
    public static void main(String[] args) {
        Login l=new Login();
        l.login("admin@123");
        l.login("admin@123","admin123");
    }
}

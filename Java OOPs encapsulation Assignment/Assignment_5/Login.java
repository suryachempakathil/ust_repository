package Assignment_5;

public class Login {
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
       
            this.username = username;
        }
        
        
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if(password.length() >= 8){
                  this.password = password;
        }else{
            System.out.println("Invalid Password.must contain 8 characters");
        }
    }
    
}

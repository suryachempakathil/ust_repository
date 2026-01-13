package Assignment_8;
class Notification{
    void send(){
        System.out.println(" sending notification ");
    }

}
class EmailNotification extends Notification{
    @Override
    void send(){
        System.out.println("Sending Email notification ");
    }
}
class SmsNotification extends Notification{
    @Override
    void send(){
        System.out.println("Sending SMS notification ");
    }
}

public class NotificationTest {
    public static void main(String[] args) {

        Notification n;
        n=new EmailNotification();
        n.send();
        n=new SmsNotification();
        n.send();
        
    }
}

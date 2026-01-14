package Assignment_12;

class Order {
    int orderId;
    String customerName;
    double amount;
    double tax;
    double totalAmount;

    // Constructor with orderId only
    Order(int orderId) {
        this.orderId = orderId;
        this.customerName = "Guest";
        this.amount = 0;
        this.tax = 0;
        this.totalAmount = 0;
    }

    // Constructor with orderId and customerName
    Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = 0;
        this.tax = 0;
        this.totalAmount = 0;
    }

    // Constructor with all fields (business logic included)
    Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;

        // Business logic: calculate tax
        this.tax = amount * 0.18; // 18% GST
        this.totalAmount = amount + tax;
    }

    void displayOrder() {
        System.out.println("Order ID       : " + orderId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Amount        : " + amount);
        System.out.println("Tax           : " + tax);
        System.out.println("Total Amount  : " + totalAmount);
        System.out.println("-----------------------------");
    }
}
public class Ecommerce{
    public static void main(String[] args) {
        Order o1 = new Order(1001);
        Order o2 = new Order(1002, "Surya");
        Order o3 = new Order(1003, "Surya", 5000);

        o1.displayOrder();
        o2.displayOrder();
        o3.displayOrder();
    }
}


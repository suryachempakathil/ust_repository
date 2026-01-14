package Assignment_4;
class BooK{
    String bname;
    String bauthor;
    double price;
    
    public BooK() {
        bname="ABC";
        bauthor="XYZ";
        price=350;
    }

    public BooK(String bname, String bauthor, double price) {
        this.bname = bname;
        this.bauthor = bauthor;
        this.price = price;
    }
     void display(){
        System.out.println("Book name: "+bname);
        System.out.println("author of the book: "+bauthor);
        System.out.println("price of the book: "+price);
        System.out.println("-------------");
     }

}
public class BookDetails {
    public static void main(String[] args) {
        BooK b1=new BooK();
        BooK b2=new BooK("pqr", "rst", 300);
        b1.display();
        b2.display();
    }
}

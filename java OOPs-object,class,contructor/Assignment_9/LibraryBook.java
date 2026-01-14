package Assignment_9;
class Library{
    private int bid;
    private String btitle;
    private String bauthor;
    public Library(int bid, String btitle, String bauthor) {
        this.bid = bid;
        this.btitle = btitle;
        this.bauthor = bauthor;
    }
    boolean isAvailable(){
        return true;
    }
     void displayBook() {
        System.out.println("Book ID : " + bid);
        System.out.println("Title   : " + btitle);
        System.out.println("Author  : " + bauthor);
        System.out.println("Available : " + isAvailable());
        System.out.println("---------------------------");
    }
}
public class LibraryBook {
    public static void main(String[] args) {
        Library l=new Library(101, "ABC", "rahul");
        l.displayBook();
    }
}

package encapsulation.booklibrarysystem;

class Book{
    private String bookId;
    private String title;
    private double price;
    private int stockQuantity;
    static int count=1;
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    void Book(){
        this.bookId="B-000";
        this.title="Untilted";
        this.price=0.0;
        this.stockQuantity=0;
    }
    void Book(String bookId,String title,double price,int stockQuantity){
        this.bookId=bookId;
        this.title=title;
        this.price=price;
        this.stockQuantity=stockQuantity;
    }
    void acceptStock(int quantity){
        if(quantity>0){
            this.stockQuantity=this.stockQuantity+quantity;
        }else{
            System.out.println("Invalid stock to add!");
        }
    }
    void issueBook(int quantity){
        if(quantity>0){
            if(quantity<=stockQuantity){
                this.stockQuantity=this.stockQuantity-quantity;
            }else{
                System.out.println("Exceed stock!");
            }
        }
    }

    void display(){
        System.out.println("------------- Book "+count+" --------------------");
        System.out.println();
        System.out.println("ID : "+bookId);
        System.out.println("Title : "+title);
        System.out.println("Price : "+price);
        System.out.println("Stock : "+stockQuantity);
        count++;
    }
}
public class BookLibrarySystem {
    public static void main(String[] args) {
        Book b1= new Book();
        b1.Book();
        b1.display();
        Book b2=new Book();
        b2.Book("B-101","Clean Code ",45,7);
        b2.acceptStock(10);
        b2.issueBook(3);
        b2.display();
    }
}

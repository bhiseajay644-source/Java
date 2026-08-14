package encapsulation.bookmanagementsystem;


class Book{
    int bookId;
    String bookName;
    String author;

    void setBook(int bookId,String bookName,String author){
        this.bookId=bookId;
        this.bookName=bookName;
        this.author=author;

    }
    void displayDetails(){
        System.out.println("Book Id: "+bookId);
        System.out.println("Book Name: "+bookName);
        System.out.println("Author: "+author);
        System.out.println();
    }
}
public class BookDemo {
    public static void main(String[] args) {
        Book b=new Book();
        b.setBook(101,"Java Programing","James Gosling");
        b.displayDetails();
        Book b1=new Book();
        b1.setBook(102,"Spring Boot","Rod Jonson");
        b1.displayDetails();
    }
}

package encapsulation.productinformation;

class Product{
    int productId;
    String productName;
    double price;
    double discount;
    double finalPrice;

    void setProduct(int productId,String productName,double price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }
    void calculateDiscount(){
         discount=(int)(price*0.1);
         finalPrice=price-discount;
    }
    void displayProductDetials(){
        System.out.println("Product Id: "+productId);
        System.out.println("Product Name: "+productName);
        System.out.println("Price : "+price);
        System.out.println();
        System.out.println("Discount : "+discount);
        System.out.println();
        System.out.println("Final Price: "+finalPrice);
    }
}
public class ProductInformation {
    public static void main(String[] args) {
        Product p=new Product();
        p.setProduct(101,"Laptop",50000);
        p.calculateDiscount();
        p.displayProductDetials();
    }
}

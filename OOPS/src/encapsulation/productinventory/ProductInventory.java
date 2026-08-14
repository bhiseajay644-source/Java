package encapsulation.productinventory;

import java.util.Scanner;

class Product{
    private int productId;
    private int quantity;
    private double price;
    static int totalProducts;
    static double totalInventoryValue;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<10){
            this.quantity=quantity+this.quantity;
            System.out.println("Low Stock");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public static void setTotalProducts(int totalProducts) {
        Product.totalProducts = totalProducts;
    }

    public static void setTotalInventoryValue(double totalInventoryValue) {
        Product.totalInventoryValue = totalInventoryValue;
    }

    static{
        totalProducts=0;
        totalInventoryValue=0;
    }
    Product(int productId,int quantity,double price){
        this.productId=productId;
        this.quantity=quantity;
        this.price=price;
    }
    double calculateValue(double price,int quantity){
    return price*quantity;
    }
    double getTotalInventoryValue(){
        return calculateValue(price,quantity);
    }

    void display(){
        System.out.println("Product Id: "+productId);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+price);
        System.out.println("total Inventory Value: "+getTotalInventoryValue());
    }

}
public class ProductInventory {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the product Id: ");
        int productId=scan.nextInt();
        System.out.println("Enter the quantity: ");
        int quantity=scan.nextInt();
        System.out.println("Enter the price: ");
        double price=scan.nextDouble();
        Product p=new Product(productId,quantity,price);
        p.calculateValue(price,quantity);
        p.getTotalInventoryValue();
        p.display();
        scan.close();
    }
}

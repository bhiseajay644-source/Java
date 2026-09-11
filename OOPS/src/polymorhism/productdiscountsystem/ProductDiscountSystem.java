package polymorhism.productdiscountsystem;

class Product{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Product(String name, double price){
        this.name=name;
        this.price=price;
    }

   public void calculateResult(){
        System.out.println("Product Discount Calculator..");
    }
}

class Electronic extends Product{
    Electronic(String name,double price){
        super(name,price);
    }

  public void calculateResult(){
        double discount=10;
        double finalprice=getPrice()-getPrice()*10/100;
        System.out.println("Product Name"+getName());
        System.out.println("Product price: "+getPrice());
        System.out.println("Discount: "+discount);
        System.out.println("Final Price: "+finalprice);
    }
}

class Clothing extends Product{
    Clothing(String name,double price){
        super(name,price);
    }

    @Override
    public void calculateResult() {
        double discount=20;
        double finalPrice=getPrice()-getPrice()*20/100;

        System.out.println("Product Name: "+getName());
        System.out.println("Price: "+getPrice());
        System.out.println("Discount: "+discount);
        System.out.println("Final Price: "+finalPrice);
    }
}
public class ProductDiscountSystem {
    public static void main(String[] args) {
        Product e =new Electronic("Laptop",50000.00);
        e.calculateResult();
    }
}

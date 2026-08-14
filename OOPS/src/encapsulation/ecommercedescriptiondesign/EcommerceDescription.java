package encapsulation.ecommercedescriptiondesign;

class Product{
    private String productId;
    private String name;
    private double unitPrice;
    private double discountPercentage;
    static int count=1;

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        if(discountPercentage>0)
        {
            if(discountPercentage<=50){
                this.discountPercentage=discountPercentage;
            }
        }
    }
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    void Product(){
        this.productId="P-000";
        this.name="Generic";
        this.unitPrice=1.0;
        this.discountPercentage=0.0;
    }
    void Product(String productId,String name, double unitPrice,double discountPercentage){
        this.productId=productId;
        this.name=name;
        this.unitPrice=unitPrice;
        this.discountPercentage=discountPercentage;

    }

    void display(){
        System.out.println("--------------Product "+count+" -------------");
        System.out.println("Product Id: "+productId);
        System.out.println("Product Name: "+name);
        System.out.println("Unit price: "+unitPrice);
        System.out.println("Discount Percentage: "+discountPercentage);
        count++;
    }
}
public class EcommerceDescription {
    public static void main(String[] args) {
        Product p1=new Product();
        p1.Product();
        p1.display();;
        Product p2=new Product();
        p2.Product("P-501","Generic Product",1.0,0.0);
        p2.setDiscountPercentage(15);
        p2.setDiscountPercentage(75);
        p2.display();
    }
}

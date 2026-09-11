package abstractionss;

abstract class FoodOrder{
    int orderId;
    String customerName;
    double bill;

    FoodOrder(int orderId,String customerName,double bill){
        this.orderId=orderId;
        this.customerName=customerName;
        this.bill=bill;
    }
    abstract void calculateBill();
}

class VegRestaurant extends FoodOrder{
    VegRestaurant(int orderId,String customerName,double bill){
        super(orderId,customerName,bill);
    }
    void calculateBill(){
        double finalBill=bill+bill*0.05;
        System.out.println("Veg restaurant Bill: "+finalBill);
    }
}

class NonVeg extends FoodOrder{
    NonVeg(int orderId,String customerName,double bill){
        super(orderId, customerName, bill);
    }
    void calculateBill(){
        double finalBill=bill+bill*0.1;
        System.out.println("NonVeg Restaurant Bill: "+finalBill);
    }
}

class FastFood extends FoodOrder{
    double deliveryCharge;
    FastFood(int orderId,String customerName,double bill,double deliveryCharge){
        super(orderId, customerName, bill);
        this.deliveryCharge=deliveryCharge;
    }

    void calculateBill(){
        double finalBill=bill+bill*0.15+deliveryCharge;
        System.out.println("FastFood Restaurant Bill: "+finalBill);
    }
}
public class OnlineFoodDeleiverySystem {
    public static void main(String[] args) {
        FoodOrder f;
        f=new VegRestaurant(101,"Ajay",500);
        f.calculateBill();
        f=new NonVeg(102,"Mayank",500);
        f.calculateBill();
        f=new FastFood(103,"Sujay",500,50);
        f.calculateBill();
    }
}

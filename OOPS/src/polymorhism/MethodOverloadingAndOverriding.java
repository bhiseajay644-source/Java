package polymorhism;

class Customer {
    private int customerId;
    private String name;

    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    void displayCustomerDetails() {
        System.out.println("Customer Id : " + customerId);
        System.out.println("Customer Name : " + name);
    }
}

class Order {
    private int orderId;
    private double amount;

    Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    // Method overloading examples
    void placeOrder() {
        System.out.println("Placed Order Successfully");
        System.out.println("Order Id: " + orderId);
        System.out.println("Amount: " + amount);
    }

    void placeOrder(String coupon) {
        double discount = 0;
        if (coupon.equals("SAVE10")) {
            discount = amount * 0.10;
        }
        double finalAmount = amount - discount;

        System.out.println("Order placed Successfully ");
        System.out.println("Order Id: " + orderId);
        System.out.println("Original amount: " + amount);
        System.out.println("Coupon: " + coupon);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }

    void placeOrder(String coupon, String deliveryAddress) {
        double discount = 0;
        if (coupon.equals("SAVE10")) {
            discount = amount * 0.10;
        }
        double finalAmount = amount - discount;

        System.out.println("Order Placed Successfully");
        System.out.println("Order ID: " + orderId);
        System.out.println("Delivery address: " + deliveryAddress);
        System.out.println("Coupon: " + coupon);
        System.out.println("Final Amount: " + finalAmount);
    }
}

// Base class
class Payment {
    void pay(double amount) {
        System.out.println("Processing general payment");
        System.out.println("Amount: " + amount);
    }
}

// Overriding examples
class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Payment through UPI");
        System.out.println("Amount: " + amount);
        System.out.println("UPI payment successful");
    }
}

class CardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Payment through Card");
        System.out.println("Amount: " + amount);
        System.out.println("Card payment successful");
    }
}

class CashPayment extends Payment {
    void pay(double amount) {
        System.out.println("Payment through Cash");
        System.out.println("Amount: " + amount);
        System.out.println("Cash payment successful");
    }
}

class FoodDeliveryService {
    void processPayment(Payment payment, double amount) {
        payment.pay(amount); // polymorphism in action
    }
}

public class MethodOverloadingAndOverriding {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "Ravi");
        Order order = new Order(5001, 1000);

        System.out.println("==========CUSTOMER============");
        customer.displayCustomerDetails();

        System.out.println("========METHOD OVERLOADING=========");
        order.placeOrder();
        System.out.println();
        order.placeOrder("SAVE10");
        System.out.println();
        order.placeOrder("SAVE10", "Hyderabad");

        System.out.println("\n============METHOD OVERRIDING===========");
        FoodDeliveryService service = new FoodDeliveryService();

        Payment payment1 = new UPIPayment();
        service.processPayment(payment1, 900);

        System.out.println();
        Payment payment2 = new CardPayment();
        service.processPayment(payment2, 900);

        System.out.println();
        Payment payment3 = new CashPayment();
        service.processPayment(payment3, 900);
    }
}

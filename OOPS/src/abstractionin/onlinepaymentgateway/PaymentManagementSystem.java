package abstractionin.onlinepaymentgateway;

public class PaymentManagementSystem {
    public static void main(String[] args) {
        UpiPayment up=new UpiPayment("UP009134","Ajay",5000.00);
        up.generateReceipt();
        up.processPayment();
        CardPayment cd=new CardPayment("CD203944AX","Sujay",7000.00,"Master");
        cd.generateReceipt();
        cd.processPayment();
    }
}

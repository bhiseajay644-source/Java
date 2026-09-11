package abstractionin.onlinepaymentgateway;

public class UpiPayment implements Payment,Receipt{
    String transactionId;
    String customerName;
    double amount;

    UpiPayment(String transactionId,String customerName,double amount){
        this.transactionId=transactionId;
        this.customerName=customerName;
        this.amount=amount;
    }

    void displayUpiPayment(){
        System.out.println("Transaction id: "+transactionId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Amount: "+amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment has been processed successfully using upi");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Transaction receipt: ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "UpiPayment{" +
                "transactionId='" + transactionId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                '}';
    }
}

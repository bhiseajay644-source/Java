package abstractionin.onlinepaymentgateway;

public class CardPayment implements Payment,Receipt {
    String transactionId;
    String customerName;
    double amount;
    String cardType;

    CardPayment(String transactionId,String customerName,double amount,String cardType){
        this.transactionId=transactionId;
        this.customerName=customerName;
        this.amount=amount;
        this.cardType=cardType;
    }

    void displayCardPayment(){
        System.out.println("Transaction Id: "+transactionId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Amount: "+amount);
        System.out.println("Card Type: "+cardType);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment has done successfully.");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt: ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CardPayment{" +
                "transactionId='" + transactionId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}

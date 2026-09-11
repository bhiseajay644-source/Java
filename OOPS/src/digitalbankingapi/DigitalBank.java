package digitalbankingapi;

public class DigitalBank implements Transfer,Loan,Insurance{
    int customerId;
    String customerName;
    long accountNumber;
    double balance;

    DigitalBank(int customerId,String customerName,long accountNumber,double balance){
        this.customerId=customerId;
        this.customerName=customerName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void displayBankDetails(){
        System.out.println("Customer id: "+customerId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
        System.out.println();
    }

    @Override
    public void lifeInsurance() {
        System.out.println("You had purchased the life insurance policy.");
    }

    @Override
    public void loanRequest() {
        System.out.println("The process of loan approval for customer is approved.");
    }

    @Override
    public void transferMoney() {
        System.out.println("Money is Transfferd form one to another account.");
    }
}

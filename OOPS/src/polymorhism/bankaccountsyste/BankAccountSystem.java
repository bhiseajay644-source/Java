package polymorhism.bankaccountsyste;

class BankAccount{
    long accountNumber;
    String holdername;
    double balance;

    BankAccount(long accountNumber,String holdername,double balance){
        this.accountNumber=accountNumber;
        this.holdername=holdername;
        this.balance=balance;
    }

    void calculateInterest(){
        System.out.println("Bank interest system");
    }
}
class SavingAccount extends BankAccount{
    double interestRate;
    SavingAccount(long accountNumber,String holdername,double balance,double interestRate){
        super(accountNumber, holdername, balance);
        this.interestRate=interestRate;
    }

    void calculateInterest(){
        double finalBalance=balance+balance*interestRate/100;
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Holder Name: "+holdername);
        System.out.println("Balance: "+balance);
        System.out.println("Interest rate: "+interestRate);
        System.out.println("Final Balance: "+finalBalance);
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {
        SavingAccount s=new SavingAccount(102773838,"Ajay",50000.00,6.5);
        s.calculateInterest();
    }
}

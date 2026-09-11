package polymorhism.bankaccountsystem;

class BankAccount{
    private long accountNumber;
    private double balance;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    BankAccount(long accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    void calcualteInterest()
    {
        System.out.println("Bank Interest Calcualtion...");
    }
}
class SavingsAccount extends BankAccount{
    SavingsAccount(long accountNumber,double balance){

        super(accountNumber,balance);
    }
    @Override
    void calcualteInterest(){
        double finalBalance=getBalance()+getBalance()*6/100;

        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Balance: "+getBalance());
        System.out.println("Final Balance: "+finalBalance);
    }
}

class CurrentAccount extends BankAccount{
    CurrentAccount(long accountNumber,double balance){
        super(accountNumber, balance);
    }
    @Override
    void calcualteInterest(){
        double finalBalance=getBalance()+getBalance()*6/100;

        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Balance: "+getBalance());
        System.out.println("Final Balance: "+finalBalance);
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount b;
        b=new SavingsAccount(10001,5000);
        b.calcualteInterest();
    }
}

package abstractionencapsulation;


abstract class BankAccount{
    private int accountNumber;
    private String holderName;
    private double balance;


    BankAccount(int accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);
}

class SavingAccount extends BankAccount{
    double finalBalance;
    SavingAccount(int accountNumber,String holderName,double balance){
        super(accountNumber, holderName, balance);
    }

    @Override
    void withdraw(double amount) {

        if(getBalance()>0){
            if(amount<getBalance()){
               setBalance(getBalance()-amount);
                System.out.println("Withdrawl Successful!");
            }else{
                System.out.println("Does not contain the minimum balance for withdrawl");
            }
        }
    }

    void display(){
        System.out.println("Account Number : "+getAccountNumber());
        System.out.println("Account Holder Name: "+getHolderName());
        System.out.println("Final Balance: "+getBalance());
    }
}
public class AtmWithdrawlSystem {
    public static void main(String[] args) {
        SavingAccount s=new SavingAccount(1001,"Ravi",15000);
        s.withdraw(12000);
        s.display();
    }
}

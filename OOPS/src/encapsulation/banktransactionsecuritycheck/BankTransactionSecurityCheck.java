package encapsulation.banktransactionsecuritycheck;


import java.util.Scanner;

class BankAccount{
    private long accountNumber;
    private double balance;
    private boolean accountActive;

    static int transactionCount=0;

    void deposite(double depositeAmount){
        if(depositeAmount>0){
            this.balance=this.balance+depositeAmount;
        }else{
            System.out.println("Invalid amount!");
        }
    }
    void withdraw(double withdrawAmount){
        if(withdrawAmount<=balance){
            this.balance=balance-withdrawAmount;
            System.out.println("Total Balance: "+balance);
        }else{
            System.out.println("Invalid amount to withdraw!");
        }
    }
    boolean checkTransaction(boolean active,double amount){
    if(accountActive && amount>0 && amount<=balance){
        return true;
    }else{
        System.out.println("Transaction is not possible!");
        return false;
    }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isAccountActive() {
        return accountActive;
    }

    public void setAccountActive(boolean accountActive) {
        this.accountActive = accountActive;
    }

    public static int getTransactionCount() {
        return transactionCount;
    }

    public static void setTransactionCount(int transactionCount) {
        BankAccount.transactionCount = transactionCount;
    }

    BankAccount(long accountNumber,double balance,boolean accountActive){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.accountActive=accountActive;
        transactionCount++;
    }

    void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
        System.out.println("Account Active: "+accountActive);
    }
}
public class BankTransactionSecurityCheck {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the account Number:");
        long accountNumber=scan.nextLong();
        System.out.println("Enter the balance:");
        double balance=scan.nextDouble();
        System.out.println("Enter account Status: ");
        boolean accountActive=scan.nextBoolean();
        BankAccount a=new BankAccount(accountNumber, balance,accountActive);
        a.display();
        System.out.println("Enter amount for deposite or withdraw:");
        double depositeAmount =scan.nextInt();
        System.out.println("Enter the amount for withdraw:");
        double withdrawAmount=scan.nextDouble();
        a.deposite(depositeAmount);

        a.checkTransaction(accountActive,withdrawAmount);
        a.withdraw(withdrawAmount);
        System.out.println("Total Transaction: "+BankAccount.transactionCount);
    }
}

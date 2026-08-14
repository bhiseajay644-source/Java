package encapsulation.bankaccountmanagement;

class Bank{
    private String accountHolderName;
    private long accountNumber;
    private double balance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if(accountHolderName.isEmpty()){
            System.out.println("Invalid Account Holder Name!");
        }else{
            this.accountHolderName=accountHolderName;
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
      if(accountNumber<0){
          System.out.println("Account Number must be greater than 0");
          System.out.println("Invalid Account Number!");
      }else{
          this.accountNumber=accountNumber;
      }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(getBalance() >=1000){
            this.balance = balance;
        }else{
            System.out.println("Minimum balance should be 1000");
        }
    }

    void displayDetails(){
        System.out.println("----------Account Details-------");
        System.out.println();
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account HOlder: "+accountHolderName);
        System.out.println("Balance       : "+ balance);

    }
}
public class BankAccountManagement {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setBalance(500.0);
        b.setAccountNumber(34095);
        b.setAccountHolderName("Ajay");
        b.displayDetails();
    }
}

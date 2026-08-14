package inheritance.multilevelinheritance;


class BankAccount{
    long accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(long accountNumber,String accountHolderName,double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    void displayBankDetails(){
        System.out.println();
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Balance: "+balance);
    }
}

class SavingAccount extends BankAccount{
    double interestRate;

    SavingAccount(long accountNumber,String accountHolderName,double balance,double interestRate){
        super(accountNumber,accountHolderName,balance);
        this.interestRate=interestRate;
    }

    void calculateInterest(){
        double interest=balance*interestRate/100;
        System.out.println("Interest : "+interest);
    }
}

class PremiumSavingAccount extends SavingAccount{
    double cashBack;

    PremiumSavingAccount(long accountNumber,String accountHolderName,double balance,double interestRate,double cashBack){
        super(accountNumber,accountHolderName,balance,interestRate);
        this.cashBack=cashBack;
    }

    void displayPremiumBenefits(){
        System.out.println("CashBack: "+cashBack);
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        PremiumSavingAccount p=new PremiumSavingAccount(19031,"Sathwik",123000.0,8.9,2300.0);
        p.displayBankDetails();
        p.calculateInterest();
        p.displayPremiumBenefits();
    }
}

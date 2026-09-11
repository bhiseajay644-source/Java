package differenttypeofexceptions.bankingapplicationexception;

import java.util.Scanner;

public class DemoTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the account number: ");
        long accountNumber=scan.nextLong();
        System.out.println("Enter the balance to set accountBalance: ");
        double balance=scan.nextDouble();
        System.out.println("Enter the amount to withdrawn: ");
        double withdrawAmount=scan.nextDouble();

        try{
            Demo.check(accountNumber);
        }catch(AccountNotFoundException e){
            System.out.println("AccountNotFoundException : "+e.getMessage());
            System.exit(0);
        }
        try{
            Demo.withdrawnAmount(balance,withdrawAmount);
        }catch(InsufficientBalanceException e){
            System.out.println("InsufficientBalanceException : "+e.getMessage());
            System.exit(0);
        } catch (DailyLimitExceededException e) {
            System.out.println("DailyLimitExceededException : "+e.getMessage());
            System.exit(0);
        }
        scan.close();
    }
}

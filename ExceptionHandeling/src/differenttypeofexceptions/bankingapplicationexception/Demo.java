package differenttypeofexceptions.bankingapplicationexception;

public class Demo {
public static final long ACCOUNT_NUMBER=12345;
    public static final double FINAL_WITHDRAWAMOUNT=5000.0;
    static void check(long accountNumber) throws AccountNotFoundException{
        if(accountNumber==ACCOUNT_NUMBER){
            System.out.println("Account verified successfully");
        }else{
            throw new AccountNotFoundException("Account not found!");
        }
    }


    public static void withdrawnAmount ( double amount,double withdrawAmount)throws InsufficientBalanceException,DailyLimitExceededException{
        double accountBalance=amount;

        if(amount>withdrawAmount && withdrawAmount<=FINAL_WITHDRAWAMOUNT){
            System.out.println("Withdraw successfully");
        }else{
            throw new InsufficientBalanceException("Insufficient account Balance!");
        }

        if(withdrawAmount>FINAL_WITHDRAWAMOUNT){
            throw new DailyLimitExceededException("Daily withdrawl limit is exceeded");
        }
    }
}

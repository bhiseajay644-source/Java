package differenttypeofexceptions.bankingapplicationexception;

public class DailyLimitExceededException extends Exception{
    DailyLimitExceededException(String message){
        super(message);
    }
}

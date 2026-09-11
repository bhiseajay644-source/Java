package differenttypeofexceptions.bankingapplicationexception;

public class ValidAmountNotfoundException extends Exception{
    ValidAmountNotfoundException(String message){
        super(message);
    }
}

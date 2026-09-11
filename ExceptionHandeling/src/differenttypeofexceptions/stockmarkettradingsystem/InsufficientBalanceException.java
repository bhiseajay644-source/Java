package differenttypeofexceptions.stockmarkettradingsystem;

public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message) {
        super(message);
    }
}

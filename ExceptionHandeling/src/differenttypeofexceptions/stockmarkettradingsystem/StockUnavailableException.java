package differenttypeofexceptions.stockmarkettradingsystem;

public class StockUnavailableException extends Exception{
    StockUnavailableException(String message) {
        super(message);
    }
}

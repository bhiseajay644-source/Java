package differenttypeofexceptions.stockmarkettradingsystem;

public class MarketClosedException extends Exception{
    public MarketClosedException(String message) {
        super(message);
    }
}

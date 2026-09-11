package differenttypeofexceptions.stockmarkettradingsystem;

public class StockMarket {
    private static final double SHARE_PRICE=2500.0;
    private static final double AVAILABLE_SHARES=100;
    static String s="open";
    static void checkMarket(String status) throws MarketClosedException{
        if(s.equalsIgnoreCase(status)){
            System.out.println("Stock market is open");
        }else{
            throw new MarketClosedException("Stock Market is closed . Trading is not allowed");
        }
    }

    static void buyShares(double balance,int quantity) throws StockUnavailableException,InsufficientBalanceException{
        double requiredAmount=SHARE_PRICE*quantity;
       if(quantity>AVAILABLE_SHARES){
           throw new StockUnavailableException("Requested shares are not available");
       }
       if(balance<requiredAmount){
           throw new InsufficientBalanceException("Insufficient trading balance");
       }else{
           System.out.println("Shares purchased successfully");
           System.out.println("Purchased Shares: "+quantity);
           System.out.println("Total amount Paid: "+requiredAmount);
           System.out.println("Remaining balance: "+(balance-requiredAmount));
       }
    }
}

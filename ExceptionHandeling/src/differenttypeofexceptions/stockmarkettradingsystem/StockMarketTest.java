package differenttypeofexceptions.stockmarkettradingsystem;

import java.util.Scanner;

public class StockMarketTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the market Status: ");
        String status=scan.nextLine();
        System.out.println("Enter the trading balance: ");
        double balance=scan.nextDouble();
        System.out.println("Enter the number of shares: ");
        int shares=scan.nextInt();

        try{
            StockMarket.checkMarket(status);
        }catch(MarketClosedException e){
            System.out.println("MarketClosedException: "+e.getMessage());
            System.exit(0);
        }
        try{
            StockMarket.buyShares(balance,shares);
        }catch(StockUnavailableException e){
            System.out.println("StockUnavailableException: "+e.getMessage());
            System.exit(0);
        }catch (InsufficientBalanceException e){
            System.out.println("InsufficientBalanceException: "+e.getMessage());
            System.exit(0);
        }
        scan.close();
    }
}

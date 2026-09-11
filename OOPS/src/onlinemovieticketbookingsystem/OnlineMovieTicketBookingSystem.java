package onlinemovieticketbookingsystem;

import digitalbankingapi.RegularBooking;

public class OnlineMovieTicketBookingSystem {
    public static void main(String[] args) {
        RegularBooking r=new RegularBooking("BK101","Rahul","Pushpa 3",500.00);
        r.generateReceipt();
        r.displayRegularBooking();
        r.statusOfBooking();
    }
}

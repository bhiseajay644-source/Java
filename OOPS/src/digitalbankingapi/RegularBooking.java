package digitalbankingapi;

import onlinemovieticketbookingsystem.Booking;
import onlinemovieticketbookingsystem.PremiumFeature;
import onlinemovieticketbookingsystem.Receipt;

public class RegularBooking implements PremiumFeature, Receipt, Booking {
    String bookingId;
    String customerName;
    String movieName;
    double ticketPrice;

    public RegularBooking(String bookingId, String customerName, String movieName, double ticketPrice){
        this.bookingId=bookingId;
        this.customerName=customerName;
        this.movieName=movieName;
        this.ticketPrice=ticketPrice;
    }

   public void displayRegularBooking(){
        System.out.println("Booking Id: "+bookingId);
        System.out.println("customer Name: "+customerName);
        System.out.println("Movie Name: "+movieName);
        System.out.println("Ticket Price: "+ticketPrice);
        System.out.println();
    }

    @Override
    public void statusOfBooking() {
        System.out.println("Booking is done successfully.");
    }

    @Override
    public void premiumBooking(String seatType) {
        System.out.println("Seat type: "+PremiumFeature.seatType);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Booking receipt: ");
        System.out.println();
    }
}

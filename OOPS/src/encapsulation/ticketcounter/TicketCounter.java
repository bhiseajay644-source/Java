package encapsulation.ticketcounter;

import java.util.Scanner;

class Movie{
    private int ticketId;
    private int seatNumber;
    private double ticketPrice;
    private boolean booked;
    static int nextTicketId;
    static double totalRevenue;
    private String bookinkgstate;

    static {
        nextTicketId=0;
    }

    {
        bookinkgstate="Not Booked";
    }

    public Movie(int ticketId, int seatNumber, double ticketPrice, boolean booked, String bookinkgstate) {
        this.ticketId = ticketId;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
        this.booked = booked;
        this.bookinkgstate = bookinkgstate;
    }

    public  String bookTicket(){
        bookinkgstate="Booked";
        return bookinkgstate;
    }

    public boolean cancelTicket(String bookinkgstate){
        if(bookinkgstate.equalsIgnoreCase("Cancel"))
        {
            return false;
        }
        return true;
    }

   static double getTotalRevenue(double ticketPrice){
        totalRevenue=ticketPrice*1;
        return totalRevenue;
    }

    void display(){
        System.out.println("Ticketr Id : "+ticketId);
        System.out.println("Seat Number : "+seatNumber);
        System.out.println("Ticket Price : "+ticketPrice);
        System.out.println("Booking status : "+bookTicket());
       System.out.println("Total Revenue : "+Movie.getTotalRevenue(ticketPrice));
    }
}
public class TicketCounter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the ticket id: ");
        int ticketId=scan.nextInt();
        System.out.println("Enter the seat Number: ");
        int seatNumber=scan.nextInt();
        System.out.println("Enter the ticket price: ");
        double ticketPrice=scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the Booking Status: ");
        String bookingstate=scan.nextLine();

        Movie m=new Movie(ticketId,seatNumber,ticketPrice,false,bookingstate);
        m.bookTicket();
        boolean result=m.cancelTicket("Cancel");
        System.out.println(result);
        m.display();
        System.out.println(Movie.getTotalRevenue(ticketPrice));
        scan.close();
    }
}

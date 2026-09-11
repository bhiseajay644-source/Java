package abstractionss;

abstract class Ride{
    int rideId;
    int distance;

    Ride(int rideId,int distance){
        this.rideId=rideId;
        this.distance=distance;
    }
    abstract void calculateFare();
}

class MiniRide extends Ride{
    MiniRide(int rideId,int distance){
        super(rideId, distance);
    }
    void calculateFare(){
        int fare=distance*10;
        System.out.println("MiniRide Fare: "+fare);
    }
}

class SedanRide extends Ride{
    SedanRide(int rideId,int distance){
        super(rideId, distance);
    }
    void calculateFare(){
        int fare=distance*15;
        System.out.println("Sedan Ride Fare: "+fare);
    }
}

class LuxuryRide extends Ride{
    LuxuryRide(int rideId,int distance){
        super(rideId, distance);
    }

    void calculateFare(){
        double fare=distance*25+(distance*25)*0.18;
        System.out.println("Luxury Ride Fare: "+fare);
    }
}
public class RideBookingApplication {
    public static void main(String[] args) {
        Ride r;
        r=new MiniRide(101,20);
        r.calculateFare();
        r=new SedanRide(102,20);
        r.calculateFare();
        r=new LuxuryRide(103,20);
        r.calculateFare();
    }
}

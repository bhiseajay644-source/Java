package abstractionencapsulation;

abstract class Ride{
    private String rideId;
    private String customerName;
    private int distance;
    private String rideType;

    Ride(String rideId,String customerName,int distance,String rideType){
        this.rideId=rideId;
        this.customerName=customerName;
        this.distance=distance;
        this.rideType=rideType;
    }

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    abstract double calculateFare();
}

class Bike extends Ride{

    Bike(String rideId,String customerName,int distance,String rideType){
        super(rideId, customerName, distance, rideType);
    }

    @Override
    double calculateFare() {
        double finalFare=0;
    if(getDistance()<=10){
        finalFare=20+getDistance()*10;
    }else{
        finalFare=20+getDistance()*10+1*getDistance();
    }
        System.out.println(getRideId()+"->"+getRideType()+"Fare: "+finalFare);
        return 0;
    }
}

class Cab extends Ride{

    Cab(String rideId, String customerName, int distance, String rideType) {
        super(rideId, customerName, distance, rideType);
    }

    @Override
    double calculateFare() {
        double finalFare=0;
        if(getDistance()<=10){
            finalFare=20+getDistance()*18;
        }else{
            finalFare=20+getDistance()*18+1*getDistance();
        }
        System.out.println(getRideId()+"->"+getRideType()+"Fare: "+finalFare);
        return finalFare;
    }

}

class PremiumRide extends Ride{

    PremiumRide(String rideId, String customerName, int distance, String rideType) {
        super(rideId, customerName, distance, rideType);
    }

    @Override
    double calculateFare() {
        double finalFare=0;
        if(getDistance()<=10){
            finalFare=50+getDistance()*30;
        }else{
            finalFare=50+getDistance()*30+1*getDistance();
        }
        System.out.println(getRideId()+"->"+getRideType()+"Fare: "+finalFare);
        return finalFare;
}
}

public class RideFareCalculationSystem {
    public static void main(String[] args) {
        Ride[] rides=new Ride[]{
                new Bike("R101","Arun",12,"Bike"),new Cab("R102","Meena",8,"Cab"),new PremiumRide("R103","John",15,"Premium")  };
        double totalFare=0;
        for(Ride r: rides){
            double fare=r.calculateFare();
            totalFare=totalFare+fare;
        }
        System.out.println("Total Fare: "+totalFare);
    }
}

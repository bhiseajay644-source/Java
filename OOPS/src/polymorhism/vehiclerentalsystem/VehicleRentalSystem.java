package polymorhism.vehiclerentalsystem;

class Vehicle{
    String vehicleNumber;
    String brand;
    double rentalRate;

    Vehicle(String vehicleNumber,String brand,double rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.brand=brand;
        this.rentalRate=rentalRate;
    }

    void calculateRentalCost(){
        System.out.println("Vehicle Rental system.");
    }
}

class Car extends Vehicle{
    int numberOfDoors;
    int days;

    Car(String vehicleNumber,String brand,double rentalRate,int days,int numberOfDoors){
        super(vehicleNumber, brand, rentalRate);
        this.numberOfDoors=numberOfDoors;
        this.days=days;
    }
    void calculateRentalCost(){
        double rentalCost=rentalRate*days;

        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Brand: "+brand);
        System.out.println("Rental Rate: "+rentalRate);

        System.out.println("Rental Cost: "+rentalCost);
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car c=new Car("TS09AB1234","Toyota",2500.0,3,4);
        c.calculateRentalCost();
    }
}

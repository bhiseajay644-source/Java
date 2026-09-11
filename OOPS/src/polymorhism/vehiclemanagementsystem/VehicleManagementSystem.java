package polymorhism.vehiclemanagementsystem;


class Vehicle{
    String brand;
    double speed;

    Vehicle(String brand,double speed){
        this.brand=brand;
        this.speed=speed;
    }

    void calculateMilege(){
        System.out.println("Millege Calculation System..");
    }
}
class Car extends Vehicle{
    double distance;
    double fuel;
    Car(String brand,double speed,double distance,double fuel){
        super(brand,speed);
        this.distance=distance;
        this.fuel=fuel;
    }
    void calculateMilege(){
        double milege=distance/fuel;

        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
        System.out.println("Milege: "+milege);
    }
}

class Bike extends Vehicle{
    double distance;
    double fuel;
    Bike(String brand,double speed,double distance,double fuel){
        super(brand,speed);
        this.distance=distance;
        this.fuel=fuel;
    }
    void calculateMilege(){
        double milege=distance/fuel;

        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
        System.out.println("Milege: "+milege);
    }
}
public class VehicleManagementSystem {
    public static void main(String[] args) {
        Car c=new Car("Toyota",120,150,10);
        c.calculateMilege();
    }
}

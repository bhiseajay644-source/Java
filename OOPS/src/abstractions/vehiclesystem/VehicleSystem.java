package abstractions.vehiclesystem;

abstract class Vehicle{
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car starts with key");
    }
    void stop(){
        System.out.println("Car stops using brake.");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike starts with self start");
    }
    void stop(){
        System.out.println("Bike stops using hand brake.");
    }
}
public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle v=new Car();
        Vehicle ve=new Bike();
        v.start();
        v.stop();
        System.out.println();
        ve.start();
        ve.stop();
    }
}

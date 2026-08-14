package inheritance.vehiclehierarchy;

class Vehicle{
    String brand;
    String model;

     Vehicle(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    void displayInfo(){
        System.out.println();
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
    }
}

class Car extends Vehicle{
    String type;
     Car(String brand,String model,String type){
        super(brand,model);
        this.type=type;
    }
    void displayCarInfo(){
        System.out.println();
        System.out.println("Type: "+type);
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
    }
}

class Bike extends Vehicle{
    String bikeType;

    Bike(String brand,String model,String bikeType){
        super(brand,model);
        this.bikeType=bikeType;
    }

    void displayBikeInfo(){
        System.out.println();
        System.out.println("Type: "+bikeType);
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
    }
}

public class VehicleHeirarchySystem {
    public static void main(String[] args) {
        Car c=new Car("Toyota","Fortuner","Car");
        c.displayCarInfo();
        Bike b=new Bike("Royal Enfield","Classic 350","Bike");
        b.displayBikeInfo();
    }
}

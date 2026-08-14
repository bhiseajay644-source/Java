package inheritance;


class Vehicle{
    protected String vehicleNumber;
    protected String brand;

    Vehicle(String vehicleNumber,String brand){
        this.vehicleNumber=vehicleNumber;
        this.brand=brand;
    }

    void displayVehicleDetails(){
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Brand : "+brand);
    }
    void calculateRentalCost(int days){
        System.out.println("Rental cost!");
    }
}

class Car extends Vehicle{
    Car (String vehicleNumber,String brand){
        super(vehicleNumber,brand);
    }
    @Override
    void calculateRentalCost(int days){
        double cost=days*2000;
        System.out.println("Car Rental Cost: "+cost);
    }
}

class Bike extends Vehicle{
    Bike(String vehicleNumber,String brand){
        super(vehicleNumber,brand);
    }
    @Override
    void calculateRentalCost(int days){
        double cost=days*80;
        System.out.println("Bike Rental cost: "+cost);
    }

}

class Truck extends Vehicle{
    Truck(String vehicleNumber,String brand){
        super(vehicleNumber,brand);
    }
    @Override
    void calculateRentalCost(int days){
        double cost=days*5000;
        System.out.println("Truck Rental Cost: "+cost);
    }
}

class RentalService{
    void generateBill(Vehicle vehicle,int days){
        vehicle.displayVehicleDetails();
        vehicle.calculateRentalCost(days);

        System.out.println("---------------------------");
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car=new Car("TS09AB1234","Toyota");
        Bike bike=new Bike("TS10XY5678","Honda");
        Truck truck=new Truck("TS11PQ9012","Tata");
        RentalService service=new RentalService();

        System.out.println("Car Rental");
        service.generateBill(car,3);
        System.out.println("\n Bike Rental");
        service.generateBill(bike,3);
        System.out.println("\nTruck Rental");
        service.generateBill(truck,3);
    }
}

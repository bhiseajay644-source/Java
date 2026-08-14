package inheritance.smartvehicleregistrationsystem;

class Vehicle{
    String vehicleNumber;
    String ownerName;
    int registrationYear;

    void acceptVehicleDetails(String vehicleNumber,String ownerName,int registrationYear){
        this.vehicleNumber=vehicleNumber;
        this.ownerName=ownerName;
        this.registrationYear=registrationYear;
    }

    void displayVehicleDetails(){
        System.out.println();
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Vehicle Owner: "+ownerName);
        System.out.println("Registration Year: "+registrationYear);
    }
}

class Car extends Vehicle{
    String company;
    String model;
    String fuelType;

    void acceptCarDetails(String company,String model,String fuelType){
        this.company=company;
        this.model=model;
        this.fuelType=fuelType;
    }
    void displayCarDetails(){
        System.out.println("Company Name: "+company);
        System.out.println("Model: "+model);
        System.out.println("Fuel Type: "+fuelType);
    }
}
public class SmartVehicleRegistrationSystem {
    public static void main(String[] args) {
        Car c=new Car();
        c.acceptVehicleDetails("MH-12-KL-1718","Sujay",2022);
        c.displayVehicleDetails();
        c.acceptCarDetails("Toyota","Y-type","Petrol");
        c.displayCarDetails();
    }
}

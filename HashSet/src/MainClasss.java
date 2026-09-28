import java.util.HashSet;
import java.util.Scanner;

public class MainClasss {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        HashSet<ParkingPass> hashset=new HashSet<>();
        System.out.println("Enter the number of Passes :");
        int pass=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<pass;i++) {
            System.out.println("Enter the passId: ");
            String passId = scan.nextLine();
            System.out.println("Enter the vehicle Number : ");
            String vehicleNumber = scan.nextLine();
            System.out.println("Enter the vehicle type :");
            String vehicleType = scan.nextLine().toUpperCase();
            try{
                if (!(vehicleType.equals("CAR") || vehicleType.equals("BIKE") || vehicleType.equals("SCOOTER"))) {
                    throw new InvalidVehicleException("Error : Invalid vehicle type. ");
                }
                System.out.println("Enter owner name: ");
                String name = scan.nextLine();
                ParkingPass p = new ParkingPass(passId, vehicleNumber, vehicleType, name);
                if(hashset.contains(passId)){
                    throw new DuplicatePassException("Error Parking Pass with "+passId+" already exists");
                }else{
                    hashset.add(p);
                    System.out.println("Parking pass "+passId+" added successfully");
                }
            } catch (DuplicatePassException | InvalidVehicleException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("==============Register Parking system=======");
        for(ParkingPass p: hashset){
            System.out.println(p);
        }
        System.out.println("Total valid Passes : "+hashset.size());
    }
}

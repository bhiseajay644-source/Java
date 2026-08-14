package encapsulation.parkinggatecontroller;

class ParkingGate{
    private int vehicleNumber;
    private int status;
    static int vehicleProcessed;

    public static final int detected=1<<0;
    public static final int payment=1<<1;
    public static final int gateOpen=1<<2;
    public static final int vehicle=1<<3;

     void detectedVehicle(int number){
        vehicleNumber=number;
        status =status | detected;
    }

    void completePayment(){
        status |=payment;
    }

    void identifyVIP(boolean isVip){
        if(isVip){
            status |=vehicle;
        }
    }
    void openGate(){
        status |=gateOpen;
    }
    boolean canEnter(){
         boolean vehicleDetected=(status & detected)!=0;
         boolean paymentDone=(status & payment)!=0;
         boolean vip=(status & vehicle)!=0;

         return vehicleDetected && paymentDone && (vip || true);
    }
    void displayStatus(){
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Vehicle Detected: "+((status & detected)!=0));
        System.out.println("Payment Completed: "+((status & payment)!=0));
        System.out.println("Vip vehicle: "+((status & vehicle)!=0));
        System.out.println("Gate open: "+((status & gateOpen)!=0));
        System.out.println("Entry Allowed: "+canEnter());
        System.out.println("Vehicle Processed: "+(++vehicleProcessed));

    }
}

public class SmartParkingController {
    public static void main(String[] args) {
       ParkingGate gate=new ParkingGate();
       gate.detectedVehicle(4521);
       gate.completePayment();
       gate.identifyVIP(false);
       gate.openGate();
       gate.displayStatus();
    }
}

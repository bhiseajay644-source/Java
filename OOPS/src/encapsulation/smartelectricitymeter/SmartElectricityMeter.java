package encapsulation.smartelectricitymeter;

import java.util.Scanner;

class ElectricityMerter{
    private int previousReading;
    private int currentReading ;
    private boolean connectionActive;
    static int metercount;
    int units;
    int allowedUnit=100;

    static{
        metercount=0;
    }
    {
        currentReading=100;
    }

    ElectricityMerter(int previousReading,int currentReading,boolean connectionActive){
        this.previousReading=previousReading;
        this.currentReading=currentReading;
        this.connectionActive=connectionActive;
    }

    void calculateUnits(int previousReading,int currentReading){
        units=currentReading-previousReading;
        System.out.println("Consumed Units: "+units);
    }
    boolean checkAlert(int units){
        if(units>allowedUnit){
            System.out.println("Emergency : True");
            System.out.print("Alert Generated: True");
            return true;
        }else{
            return false;
        }
    }
    void display(){
        System.out.println();
        System.out.println("Previous Reading: "+previousReading);
        System.out.println("Current Reading: "+currentReading);
        System.out.println("Current Connection: "+connectionActive);

    }

}

public class SmartElectricityMeter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Previous Reading: ");
        int previousReading =scan.nextInt();
        System.out.println("Enter the current Reading:");
        int currentReading=scan.nextInt();
        System.out.println("Enter the connection: ");
        boolean connectionActive=scan.nextBoolean();
        ElectricityMerter e=new ElectricityMerter(previousReading,currentReading,connectionActive);
        e.display();
        e.calculateUnits(previousReading,currentReading);
        e.checkAlert(e.units);
        scan.close();
    }
}

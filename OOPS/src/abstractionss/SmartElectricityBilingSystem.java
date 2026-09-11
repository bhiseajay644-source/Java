package abstractionss;

abstract class ElectricityBill{
    int customerId;
    int unit;

    ElectricityBill(int customerId,int unit){
        this.customerId=customerId;
        this.unit=unit;
    }
    abstract void generateBill();
}

class DomesticConnection extends ElectricityBill{
    DomesticConnection(int customerId,int unit){
        super(customerId,unit);
    }

    void generateBill(){
        int electricityBill=unit*5;
        System.out.println("Domestic Bill: "+electricityBill);
    }
}
class CommercialBill extends ElectricityBill{
    CommercialBill(int customerId,int unit){
        super(customerId, unit);
    }
    void generateBill(){
        double electricityBill=unit*8+(unit*8)*.15;
        System.out.println("Commercial Bill: "+electricityBill);
    }
}
public class SmartElectricityBilingSystem {
    public static void main(String[] args) {
        ElectricityBill e;
        e=new DomesticConnection(101,20);
        e.generateBill();
        e=new CommercialBill(102,20);
        e.generateBill();
    }
}

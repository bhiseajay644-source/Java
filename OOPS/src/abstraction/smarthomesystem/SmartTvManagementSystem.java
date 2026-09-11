package abstraction.smarthomesystem;

public class SmartTvManagementSystem {
    public static void main(String[] args) {
        SmartTV s=new SmartTV("Samsung","Smart Type","44*45inches","AirFibre");
        s.displayDeviceDetails();
        s.turnOn();
        s.connectTowifi();
        s.disconnectFromWifi();
        s.turnOff();

    }
}

package abstraction.smarthomesystem;

public class SmartTV implements SmartHomeSystem,InternetConnected{

    String brandName;
    String model;
    String screenSize;
    String wifiName;

    SmartTV(String brandName,String model,String screenSize,String wifiName){
        this.brandName=brandName;
        this.model=model;
        this.screenSize=screenSize;
        this.wifiName=wifiName;
    }
    @Override
    public void turnOn() {
        System.out.println("Tv is turnOn.");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv was turnoff");
    }

    @Override
    public void connectTowifi() {
        System.out.println("Connect to wifi");
    }

    @Override
    public void disconnectFromWifi() {
        System.out.println("Disconnect From wifi");

    }
        void displayDeviceDetails(){
            System.out.println("Brand Name: "+brandName);
            System.out.println("Model: "+model);
            System.out.println("Screen Size: "+screenSize);
            System.out.println("Wifi Name: "+wifiName);


        }
    }

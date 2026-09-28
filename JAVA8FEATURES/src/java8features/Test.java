package java8features;

public class Test {
    public static void main(String[] args) {
        DoorSensor sensor=new DoorSensor();
        SmartLight light=new SmartLight();

       if(IoDevice.isDeviceValid("DS-1109")){
           sensor.connect();
           sensor.sendHeartBeat("DoorSensor");
           sensor.disconnect();
       }
        System.out.println("===================");
       if(IoDevice.isDeviceValid("SL-5678")){
           light.connect();
           light.sendHeartBeat("Smart Light");
           light.disconnect();
       }
    }
}

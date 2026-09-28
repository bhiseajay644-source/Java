package java8features;

public interface IoDevice {
    void connect();
    void disconnect();

    default void sendHeartBeat(String device){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(device+" is active");
        }
    }

    static boolean isDeviceValid(String deviceId){
        if(deviceId==null || deviceId.length()==0)
            return false;
            if(deviceId.startsWith("DS") || deviceId.endsWith("SL"))
                return true;
            else
                return false;
    }
}

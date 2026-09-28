package java8features;

public class DoorSensor implements IoDevice{
    @Override
    public void connect() {
        System.out.println("Door sensor : connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Door sensor : Disconnected");
    }
    @Override
    public void sendHeartBeat(String device){
        try{
            Thread.sleep(8000);
        }catch(InterruptedException e){
            System.out.println("The device : "+device+" is active");
        }
    }
}

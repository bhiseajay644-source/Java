package java8features;

public class SmartLight implements IoDevice{
    @Override
    public void connect() {
        System.out.println("Smart Light : Connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Smart Light : Disconnected");
    }
}

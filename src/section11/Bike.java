package section11;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stoping...");
    }

    @Override
    public String whatsMyType() {
        return "I'm a Bike";
    }

    @Override
    public String myGrassRoot() {
        return "My grassroot background: I'm a fucking bike";
    }

    static String sayHello() {
        return "Hello from Bike";
    }
}

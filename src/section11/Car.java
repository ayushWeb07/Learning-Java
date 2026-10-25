package section11;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stoping...");
    }

    @Override
    public String whatsMyType() {
        return "I'm a Car";
    }
}

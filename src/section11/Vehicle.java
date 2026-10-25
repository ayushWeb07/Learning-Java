package section11;

public interface Vehicle {
    public final static String MACHINE_NAME= "Vehicle";

    void start();

    void stop();

    String whatsMyType();

    default String myGrassRoot() {
        return "My grassroot background: I'm a fucking vehicle";
    }

    static String sayHello() {
        return "Hello from interface";
    }
}

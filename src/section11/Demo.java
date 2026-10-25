package section11;

public class Demo {
    public static void main(String[] args) {
        // create object of type car
        Car c= new Car();
        System.out.println(c.whatsMyType());
        c.start();
        c.stop();
        System.out.println(c.myGrassRoot());

        System.out.println();

        // create object of reference type Vehicle interface, but stores instance of bike class
        Vehicle b= new Bike();
        System.out.println(b.whatsMyType());
        b.start();
        b.stop();
        System.out.println(b.myGrassRoot());
    }
}
